package com.example.GroceryStore.service;

import com.example.GroceryStore.entity.Customer;
import com.example.GroceryStore.entity.Grocery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GroceryService {
        public List<Grocery> getAll();
        public Optional<Grocery> findById (int id);
        public void deleteById (int id);
        public Grocery save (Grocery grocery);

        public Customer findByGroceryName (String name);
}
