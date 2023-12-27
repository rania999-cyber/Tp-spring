package com.example.Service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Models.RentalContract;
import com.example.Repository.RentalContractRepo;
import java.util.List;
  
@Service
public class RentalContractServiceImpl implements RentalContractService {

    private final RentalContractRepo rentalContractRepo;

    @Autowired
    public RentalContractServiceImpl(RentalContractRepo rentalContractRepo) {
        this.rentalContractRepo = rentalContractRepo;
    }

    @Override
    public RentalContract save(RentalContract rentalContract) {
        return rentalContractRepo.save(rentalContract);
    }

    @Override
    public List<RentalContract> getAll() {
        return rentalContractRepo.findAll();
    }

    @Override
    public RentalContract getById(Long id) {
        return rentalContractRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        rentalContractRepo.deleteById(id);
    }

     
    }




