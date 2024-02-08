package com.example.GroceryStore.service.impl;

import com.example.GroceryStore.entity.Customer;
import com.example.GroceryStore.entity.Grocery;
import com.example.GroceryStore.repo.CustomerRepo;
import com.example.GroceryStore.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    @Override
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        customerRepo.deleteById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Grocery findByCustomerName(String name) {
        Customer customer = customerRepo.findByName(name);
        return null;
    }
}
