package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Models.Owner;
import com.example.Repository.OwnerRepo;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImp {

    private final OwnerRepo ownerRepo;

    @Autowired
    public OwnerServiceImp(OwnerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    public List<Owner> getAllOwners() {
        return ownerRepo.findAll();
    }

    public Optional<Owner> getOwnerById(Integer ownerId) {
        return ownerRepo.findById(ownerId);
    }

    public Owner saveOwner(Owner owner) {
        return ownerRepo.save(owner);
    }

    public void deleteOwner(Integer ownerId) {
        ownerRepo.deleteById(ownerId);
    }
}

