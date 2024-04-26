package com.getfirst.getstarted.services;

import com.getfirst.getstarted.dtos.FakeStoreCategoryDto;
import com.getfirst.getstarted.dtos.FakeStoreProductDto;
import com.getfirst.getstarted.models.Category;
import com.getfirst.getstarted.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class fakeStoreProductService implements ProductService{


    private RestTemplate restTemplate;

    @Autowired
    public fakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getSingleProduct(Long productid) {
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + productid,
                FakeStoreProductDto.class
        );
        return fakeStoreProductDto.toProduct();
    }

    @Override
    public List<Product> getProducts() {
        FakeStoreProductDto[] fakeStoreProductDtos =
                restTemplate.getForObject
                        ("https://fakestoreapi.com/products", FakeStoreProductDto[].class
                );

        List<Product> products = new ArrayList<>();

        for(FakeStoreProductDto fakeStoreProductsDto : fakeStoreProductDtos) {
            products.add(fakeStoreProductsDto.toProduct());
        }
//        for(int i=0;i<FakeStoreProductDto.length();i++){
//            products[i] = fakeStoreProductDto.toProduct();
//        }
        return products;
//        List<Product> FakeStoreProductDto;
//            return fakeStoreProductDtos;
    }

    @Override
    public Product createProduct(String title,
                                 String description,
                                 String category,
                                 double price,
                                 String image) {
        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();
        fakeStoreProductDto.setCategory(category);
        fakeStoreProductDto.setTitle(title);
        fakeStoreProductDto.setImage(image);
        fakeStoreProductDto.setDescription(description);
        fakeStoreProductDto.setPrice(price);

        FakeStoreProductDto response = restTemplate.postForObject("https://fakestoreapi.com/products",
                fakeStoreProductDto, FakeStoreProductDto.class
                );
        return response.toProduct();
    }

    @Override
    public List<Product> getProductsfromCategory(String category) {
       Category category1 = new Category();
       String categoryStr  = category1.getTitle();
       FakeStoreProductDto[] fakeStoreProductDtos =
               restTemplate.getForObject("https://fakestoreapi.com/products/category/"+category,
                       FakeStoreProductDto[].class);
        List<Product> productsCat = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto_ : fakeStoreProductDtos){
            productsCat.add(fakeStoreProductDto_.toProduct());
        }
        return productsCat;
    }



    @Override
    public List<Category> getAllCategory() {
        String[] fakeStoreCategoryDtos = restTemplate.getForObject("https://fakestoreapi.com/products/categories",
                String[].class);

        List<Category> prodCategory = new ArrayList<>();
        for(String catTitle : fakeStoreCategoryDtos){
            prodCategory.add(new Category(catTitle));
        }
        return prodCategory;
    }


}
