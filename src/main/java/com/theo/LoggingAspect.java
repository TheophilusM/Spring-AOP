package com.theo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // defining run point cut matching any passed inputs for a specific package
    @Before("execution(* com.theo.ShoppingCart.checkout(..))")
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

    @Pointcut("execution(* *.*.*.quantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After returning");
        System.out.println("Return value: " + retVal);
    }
}
