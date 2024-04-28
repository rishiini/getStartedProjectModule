package com.getfirst.getstarted.repository;

import com.getfirst.getstarted.models.Category;
import com.getfirst.getstarted.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Product, Long> {
    Category findByTitle(String title);
    Category save(Category category);
}
