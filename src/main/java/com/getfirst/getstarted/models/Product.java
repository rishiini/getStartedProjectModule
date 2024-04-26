package com.getfirst.getstarted.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product extends BaseModel{
    private String title;
    private String description;
    private double price;
    private String imageURL;
    private Category category;


}
