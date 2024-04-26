package com.getfirst.getstarted.dummy;

import org.springframework.web.client.RestTemplate;

public class dummy {
    private RestTemplate restTemplate;
    public dummy(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
}
