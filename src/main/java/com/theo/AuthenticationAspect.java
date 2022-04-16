package com.theo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    // define the point cuts - for all in the com.theo package
    @Pointcut("within(com.theo..*)")
    public void authenticationPointCut() {

    }
    @Pointcut("within(com.theo..*)")
    public void authorizationPointCut() {

    }

    // can use && or ||
    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authentication(){
        System.out.println("Authenticating the request");
    }
}
