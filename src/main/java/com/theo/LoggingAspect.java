package com.theo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // defining run point
    @Before("execution(* com.theo.ShoopingCart.checkout())")
    public void logger() {
        System.out.println("Logger aspect");
    }
}
