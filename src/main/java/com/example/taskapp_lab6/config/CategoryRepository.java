package com.example.taskapp_lab6.config;

import com.example.taskapp_lab6.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}