package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectClass {
    
    @Pointcut("execution(* org.example.Observable.*(..))")
    public void methodCall() {}

    @Before("methodCall()")
    public void log(JoinPoint joinPoint){
        System.out.println("ASPECTJ advise");
    }
    
    
//    @Before("execution(* org.example.Observable.*(..))")
//    public void log(JoinPoint joinPoint){
//        System.out.println("ASPECTJ advise");
//    }
}

