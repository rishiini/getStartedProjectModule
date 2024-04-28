package com.getfirst.getstarted.repository;

import com.getfirst.getstarted.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product p);

}
