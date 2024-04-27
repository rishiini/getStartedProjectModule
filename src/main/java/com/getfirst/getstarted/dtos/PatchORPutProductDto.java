package com.getfirst.getstarted.dtos;


import com.getfirst.getstarted.models.Category;
import com.getfirst.getstarted.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatchORPutProductDto {
    private String title;
    private String image;
    private String description;
    private String category;
    private double price;

    public Product toProduct(){
        Product product = new Product();
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
