package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Models.Property;
import com.example.Repository.PropertyRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepo propertyRepo;

    @Autowired
    public PropertyServiceImpl(PropertyRepo propertyRepo) {
        this.propertyRepo = propertyRepo;
    }

    @Override
    public void save(Property property) {
        propertyRepo.save(property);
    }

    @Override
    public List<Property> getAll() {
        return propertyRepo.findAll();
    }

    @Override
    public Property getById(Long id) {
        Optional<Property> optionalProperty = propertyRepo.findById(id);
        return optionalProperty.orElse(null);
    }

    @Override
    public void delete(Property property) {
        propertyRepo.delete(property);
    }

    @Override
    public Property getPropertyById(Long propertyId) {
         throw new UnsupportedOperationException("Unimplemented method 'getPropertyById'");
    }

    @Override
    public void saveProperty(Property property) {
         throw new UnsupportedOperationException("Unimplemented method 'saveProperty'");
    }

    @Override
    public Iterable<Property> getAllProperties() {
         throw new UnsupportedOperationException("Unimplemented method 'getAllProperties'");
    }

    @Override
    public void deleteProperty(Property property) {
         throw new UnsupportedOperationException("Unimplemented method 'deleteProperty'");
    }
}

