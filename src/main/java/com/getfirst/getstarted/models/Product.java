package com.getfirst.getstarted.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseModel{
    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageURL;
    @ManyToOne
//    @ManyToMany
    private Category category;


}
