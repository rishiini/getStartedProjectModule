package com.getfirst.getstarted.services;

import com.getfirst.getstarted.models.Category;
import com.getfirst.getstarted.models.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product getSingleProduct(Long productid);
    List<Product> getProducts();


    Product createProduct(String title, String description, String category, double price, String image);
//    Product getProductsfromCategory(Category category);
    List<Product> getProductsfromCategory(String category);

    List<Category> getAllCategory();

}
