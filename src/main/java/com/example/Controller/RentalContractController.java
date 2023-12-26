package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Models.RentalContract;
import com.example.Service.RentalContractService;

import java.util.List;

@RestController
@RequestMapping("/rental-contracts")
public class RentalContractController {

    private final RentalContractService rentalContractService;

    @Autowired
    public RentalContractController(RentalContractService rentalContractService) {
        this.rentalContractService = rentalContractService;
    }

    @GetMapping
    public List<RentalContract> getAllRentalContracts() {
        return rentalContractService.getAll();
    }

    @GetMapping("/{id}")
    public RentalContract getRentalContractById(@PathVariable Long id) {
        return rentalContractService.getById(id);
    }

    @PostMapping
    public RentalContract createRentalContract(@RequestBody RentalContract rentalContract) {
        return rentalContractService.save(rentalContract);
    }

    @DeleteMapping("/{id}")
    public void deleteRentalContract(@PathVariable Long id) {
        rentalContractService.delete(id);
    }
}
