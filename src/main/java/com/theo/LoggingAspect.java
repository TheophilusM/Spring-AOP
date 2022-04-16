package com.theo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // defining run point cut matching any passed inputs
    @Before("execution(* com.theo.ShoopingCart.checkout(..))")
    public void beforeLogger() {
        System.out.println("Logger before aspect");
    }

    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger() {
        System.out.println("Logger after aspect");
    }
}
