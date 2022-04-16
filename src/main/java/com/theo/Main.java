package com.theo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoopingCart shoopingCart = applicationContext.getBean(ShoopingCart.class);
        shoopingCart.checkout("Request sent argument");
    }
}
