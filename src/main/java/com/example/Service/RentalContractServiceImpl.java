package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Models.RentalContract;
import com.example.Repository.RentalContractRepo;

import java.util.List;
import java.util.Optional;

@Service
public class RentalContractServiceImpl implements RentalContractService {

    public final RentalContractRepo rentalContractRepo;

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
        return rentalContractRepo.getAll();
    }

    @Override
    public RentalContract getById(Long id) {
                Optional<RentalContract> optionalRentalContract = rentalContractRepo.findById(id);
                 return optionalRentalContract.orElse(null);
    }

    @Override
    public void delete(RentalContract rentalContract) {
        if (rentalContract != null) {
            rentalContractRepo.delete(rentalContract);
        }
    }

    @Override
    public void delete(Long id) {
        rentalContractRepo.deleteById(id);
    }
}



