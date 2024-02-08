package com.example.GroceryStore.controller;

import com.example.GroceryStore.entity.Customer;
import com.example.GroceryStore.entity.Grocery;
import com.example.GroceryStore.service.CustomerService;
import com.example.GroceryStore.service.GroceryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequiredArgsConstructor
@RequestMapping("/groceries")
public class GroceryController {
    private final GroceryService groceryService;



    @GetMapping("/all")
    public List<Grocery> getAllCustomers() {
        return groceryService.getAll();
    }


    @Transactional
    @PostMapping("/addGrocery")
    public ResponseEntity<String> saveGrocery(@RequestBody Grocery groceryRequest) {
        groceryService.save(groceryRequest);
        return ResponseEntity.ok("Grocery saved succesfully");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
        groceryService.deleteById(id);
        return ResponseEntity.ok("Grocery deleted successfully");
    }
}
