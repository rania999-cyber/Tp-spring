package com.example.Service;


import java.util.List;

import com.example.Models.Owner;
 
 public interface OwnerService {
    void save(Owner owner);
    List<Owner> getAll();
    Owner getById(Integer id);
    void delete(Owner owner);
}