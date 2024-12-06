package com.example.E_commerce.Demo.app.repository;

import com.example.E_commerce.Demo.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
