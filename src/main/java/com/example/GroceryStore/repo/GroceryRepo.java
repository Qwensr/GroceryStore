package com.example.GroceryStore.repo;

import com.example.GroceryStore.entity.Grocery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryRepo extends JpaRepository<Grocery, Integer> {
    Grocery findByName(String name);
}
