package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Models.Property;

public interface PropertyRepo extends JpaRepository<Property, Long> {

}


