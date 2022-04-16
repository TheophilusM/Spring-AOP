package com.theo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // defining run point cut matching any passed inputs for a specific package
    @Before("execution(* com.theo.ShoopingCart.checkout(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        // to access input args
        System.out.println();
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs()[0].toString());   // array of argument
        System.out.println();
        System.out.println("Logger before aspect");
    }

    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger() {
        System.out.println("Logger after aspect");
    }
}
