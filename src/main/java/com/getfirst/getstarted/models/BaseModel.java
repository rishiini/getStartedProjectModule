package com.getfirst.getstarted.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseModel{
    @Id
    private Long id;
    private Date createdAt;
    private Date lastUpdated;
    private boolean isDeleted;
}
