package com.example.Service;

import java.util.List;

import com.example.Models.Property;

public interface PropertyService {
    void save(Property property);
    List<Property> getAll();
    Property getById(Long id);
    void delete(Property property);
    Property getPropertyById(Long propertyId);
    void saveProperty(Property property);
    Iterable<Property> getAllProperties();
    void deleteProperty(Property property);
}
