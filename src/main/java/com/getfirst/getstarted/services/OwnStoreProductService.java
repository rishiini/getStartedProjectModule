package com.getfirst.getstarted.services;

import com.getfirst.getstarted.models.Category;
import com.getfirst.getstarted.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ownStoreProductService")
public class OwnStoreProductService implements ProductService{

    @Override
    public Product getSingleProduct(Long productid) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product createProduct(String title, String description, String category, double price, String image) {
        return null;
    }

    @Override
    public List<Product> getProductsfromCategory(String category) {
        return null;
    }

    @Override
    public List<Category> getAllCategory() {
        return null;
    }

    @Override
    public Product patchAProduct(Long id, String title, String description, String category, double price, String image) {
        return null;
    }
}
