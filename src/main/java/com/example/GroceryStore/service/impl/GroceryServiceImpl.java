package com.example.GroceryStore.service.impl;

import com.example.GroceryStore.entity.Customer;
import com.example.GroceryStore.entity.Grocery;
import com.example.GroceryStore.repo.GroceryRepo;
import com.example.GroceryStore.service.GroceryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GroceryServiceImpl implements GroceryService {
    private final GroceryRepo groceryRepo;
    @Override
    public List<Grocery> getAll() {
        return groceryRepo.findAll();
    }

    @Override
    public Optional<Grocery> findById(int id) {
        return groceryRepo.findById(id);
    }

    @Override
    public void deleteById(int id) {
        groceryRepo.deleteById(id);

    }

    @Override
    public Grocery save(Grocery grocery) {
        return groceryRepo.save(grocery);
    }

    @Override
    public Customer findByGroceryName(String name) {
        Grocery grocery = groceryRepo.findByName(name);
        return null;
    }
}
