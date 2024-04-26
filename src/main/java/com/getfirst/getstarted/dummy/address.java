package com.getfirst.getstarted.dummy;

import org.springframework.web.client.RestTemplate;

public class address {
    private String street;
    private int number;

    public address(String street, int number){
        this.street = street;
        this.number = number;
    }

}
