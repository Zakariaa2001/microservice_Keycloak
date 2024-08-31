package com.example.keyclock_spring.repository;

import com.example.keyclock_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
