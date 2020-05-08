package org.example;

public class Observable {
    
    protected POJO pojo;
    
    public Observable(POJO pojo) {
        this.pojo = pojo;
    }
    
    public void someMethod(){
        System.out.println("inside someMethod body");
    }
}
