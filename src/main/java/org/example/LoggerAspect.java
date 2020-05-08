package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerAspect {
    
    @Pointcut("execution(* org.example.Observable.*(..))")
    public void methodCall() {}

    @Before("methodCall()")
    public void log(JoinPoint joinPoint){
        System.out.println("AspectJ advise");
        
        System.out.println("joinPoint: "+ joinPoint.toString());
        //pojo is protected attribute of Observable
        System.out.println("observable.pojo.dataString: "+ ((Observable)joinPoint.getTarget()).pojo.getDataString());
    }
    
//    @Before("execution(* org.example.Observable.*(..))")
//    public void log(JoinPoint joinPoint){
//        System.out.println("ASPECTJ advise");
//    }
}

