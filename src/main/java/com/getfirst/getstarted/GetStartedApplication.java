package com.getfirst.getstarted;

import com.getfirst.getstarted.controller.HelloController;
import com.getfirst.getstarted.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetStartedApplication {


    public static void main(String[] args) {
        SpringApplication.run(GetStartedApplication.class, args);
    }

}
