package com.getfirst.getstarted.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDto {
    private String title;
    private String image;
    private String description;
    private String category;
    private double price;
//    private Long userid;
}
