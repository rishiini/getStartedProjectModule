package com.getfirst.getstarted.dtos;

import com.getfirst.getstarted.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCategoryDto {
    private String title;
//    private Long id;
    public Category toCategory(){
        Category category1 = new Category();
//        category1.setId(id);
        category1.setTitle(title);
        return category1;
    }
}
