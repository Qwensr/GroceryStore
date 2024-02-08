package com.example.GroceryStore.repo;

import com.example.GroceryStore.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    Customer findByName (String name);
}
