package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Models.Property;
import com.example.Service.PropertyService;

import io.swagger.models.Model;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/getProperty/{propertyId}")
    public Property getProperty(@PathVariable Long propertyId) {
        return propertyService.getPropertyById(propertyId);
    }

    @PostMapping("/saveProperty")
    public void saveProperty(@RequestBody Property property) {
        propertyService.saveProperty(property);
    }

    @GetMapping("/getAllProperties")
    public Iterable<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @DeleteMapping("/deleteProperty/{propertyId}")
    public void deleteProperty(@PathVariable Long propertyId) {
        Property property = propertyService.getPropertyById(propertyId);
        if (property != null) {
            propertyService.deleteProperty(property);
        }
    }

    @GetMapping("/add-property")
    public String showAddPropertyForm(Model model) {
        // Implementation...
        return "add-edit-Property";
    }

    @GetMapping("/edit-property/{propertyId}")
    public String showEditPropertyForm(@PathVariable Long propertyId, Model model) {
        // Implementation...
        return "add-edit-Property";
    }  
}

