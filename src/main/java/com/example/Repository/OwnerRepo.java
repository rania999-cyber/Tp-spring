package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Models.Owner;

public interface OwnerRepo extends JpaRepository<Owner, Integer> {
    List<Owner> findByName(String name);
}