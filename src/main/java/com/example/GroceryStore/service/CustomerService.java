package com.example.GroceryStore.service;

import com.example.GroceryStore.entity.Customer;
import com.example.GroceryStore.entity.Grocery;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    public List<Customer> getAll();
    public Customer findById (int id);
    public void deleteById (int id);
    public Customer save (Customer customer);

    public Grocery findByCustomerName (String name);
}

