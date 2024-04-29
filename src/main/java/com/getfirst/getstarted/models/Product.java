package com.getfirst.getstarted.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

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
    @ManyToOne(cascade = {CascadeType.PERSIST})
//    @ManyToMany
//    @JsonIgnore
    private Category category;


}
