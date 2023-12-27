package com.example.Service;

import java.util.List;

import com.example.Models.RentalContract;

public interface RentalContractService {
    RentalContract save(RentalContract rentalContract);
    List<RentalContract> getAll();
    RentalContract getById(Long id);
    void delete(Long id);
}
