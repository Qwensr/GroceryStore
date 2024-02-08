package com.example.GroceryStore.controller;

import com.example.GroceryStore.entity.Customer;
import com.example.GroceryStore.service.CustomerService;
import com.example.GroceryStore.service.GroceryService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cutomers")
public class CustomerController {
    private final CustomerService customerService;


    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }


    @Transactional
    @PostMapping("/addCustomer")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customerRequest) {
        customerService.save(customerRequest);
        return ResponseEntity.ok("Customer saved succesfully");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
        customerService.deleteById(id);
        return ResponseEntity.ok("Customer deleted successfully");
    }
}
