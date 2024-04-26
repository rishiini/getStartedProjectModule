package com.getfirst.getstarted.models;

import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseModel{
    private String title;

    public Category(String catTitle) {
        this.title = catTitle;
    }
}
