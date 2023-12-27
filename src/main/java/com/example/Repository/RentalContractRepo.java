package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.example.Models.RentalContract;

public interface RentalContractRepo extends JpaRepository<RentalContract, Long> {

    List<RentalContract> getAll();
 }
