package com.getfirst.getstarted;

import com.getfirst.getstarted.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GetStartedApplicationTests {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void contextLoads() {
    }
//   @Test
//   void testingQueries(){
//        productRepository.findAllByTitle("Hello");
//   }

}
