package com.getfirst.getstarted.dtos;

import com.getfirst.getstarted.models.Category;
import com.getfirst.getstarted.models.Product;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String image;
    private String description;
    private double price;
    private String category;

    public Product toProduct(){
        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setImageURL(image);

        Category prodCategory = new Category();
        prodCategory.setTitle(category);

        product.setCategory(prodCategory);
        return product;

    }


}
