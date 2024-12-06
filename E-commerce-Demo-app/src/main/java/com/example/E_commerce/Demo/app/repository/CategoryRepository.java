package com.example.E_commerce.Demo.app.repository;

import com.example.E_commerce.Demo.app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

