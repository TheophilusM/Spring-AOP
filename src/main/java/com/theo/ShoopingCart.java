package com.theo;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class ShoopingCart {

    public void checkout(String status){
        // Logging request
        // authentication and authorization
        // Sanitize the data

        // Business logic
        System.out.println("Checkout method");
    }
}
