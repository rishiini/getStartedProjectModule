package com.getfirst.getstarted.controller;

import com.getfirst.getstarted.dtos.CreateProductRequestDto;
import com.getfirst.getstarted.models.Category;
import com.getfirst.getstarted.models.Product;
import com.getfirst.getstarted.services.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class HelloController{
//    private ProductService ps ;
    private ProductService productService;
    private RestTemplate restTemplate;

    public HelloController(ProductService productService, RestTemplate restTemplate){
        this.productService = productService;
        this.restTemplate = restTemplate;
    }
//    private ProductService ps1 = new ownStoreProductService();

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id) {
//        return ps.getSingleProduct(id);
        return productService.getSingleProduct(id);
    }
    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto request){
        return productService.createProduct(request.getTitle(),
                                                                    request.getDescription(),
                                                                    request.getCategory(),
                                                                    request.getPrice(),
                                                                    request.getImage()
                );
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

//    getProductsfromCategory
    @GetMapping("products/category/{categoryName}")
    public List<Product> getProductsfromCategory(@PathVariable("categoryName") String category){
        return productService.getProductsfromCategory(category);
    }

    @GetMapping("/products/categories")
    public List<Category> getAllCategory(){
        return productService.getAllCategory();
    }



}