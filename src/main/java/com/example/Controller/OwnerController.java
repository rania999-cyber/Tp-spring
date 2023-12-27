package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Models.Owner;
import com.example.Service.OwnerService;

import io.swagger.models.Model;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/getOwner/{ownerId}")
    public Owner getOwner(@PathVariable Integer ownerId) {
        return ownerService.getById(ownerId);
    }

    @PostMapping("/saveOwner")
    public void saveOwner(@RequestBody Owner owner) {
        ownerService.save(owner);
    }

    @GetMapping("/getAllOwners")
    public Iterable<Owner> getAllOwners() {
        return ownerService.getAll();
    }

    @DeleteMapping("/deleteOwner/{ownerId}")
    public void deleteOwner(@PathVariable Integer ownerId) {
        Owner owner = ownerService.getById(ownerId);
        if (owner != null) {
            ownerService.delete(owner);
        }
    }

    
    @GetMapping("/owners")
public String listOwners(Model model) {
    // Implementation...
    return "list-Owner";
}

@GetMapping("/owners/add-owner")
public String showAddOwnerForm(Model model) {
    // Implementation...
    return "add-edit-Owner";
}

@GetMapping("/owners/edit-owner/{id}")
public String showEditOwnerForm(@PathVariable Long id, Model model) {
    // Implementation...
    return "add-edit-Owner";
}

}



    

