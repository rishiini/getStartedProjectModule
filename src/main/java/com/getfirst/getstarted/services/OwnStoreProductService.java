package com.getfirst.getstarted.services;

import com.getfirst.getstarted.models.Category;
import com.getfirst.getstarted.models.Product;
import com.getfirst.getstarted.repository.CategoryRepository;
import com.getfirst.getstarted.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Service("ownStoreProductService")
public class OwnStoreProductService implements ProductService{

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public OwnStoreProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long productid) {
        return productRepository.findByIdIs(productid);

    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    @Override
    public Product createProduct(String title, String description, String category, double price, String image) {
        Product product = new Product();
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImageURL(image);

        Category category1 = categoryRepository.findByTitle(category);
        if(category1 == null){
            Category newCategory  = new Category();
            newCategory.setTitle(category);
            category1 = categoryRepository.save(newCategory);
            category1 = newCategory;
        }
        product.setCategory(category1 );
        Product savedProduct = productRepository.save(product);
        return savedProduct;
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
