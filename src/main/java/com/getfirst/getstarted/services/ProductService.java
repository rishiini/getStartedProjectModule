package com.getfirst.getstarted.services;

import com.getfirst.getstarted.dtos.FakeStoreProductDto;
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
    //This will get a Single Product
    Product getSingleProduct(Long productid);
    //This will get All the Products
    List<Product> getProducts();

    //This will create a single product
    Product createProduct(String title, String description, String category, double price, String image);
//    Product getProductsfromCategory(Category category);
    // This will get all the products from a category
    List<Product> getProductsfromCategory(String category);

    // This will get all the category name
    List<Category> getAllCategory();
    Product patchAProduct(Long id, String title, String description, String category, double price, String image);

}
