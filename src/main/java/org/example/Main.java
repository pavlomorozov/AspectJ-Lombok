package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        POJO pojo = new POJO();
        pojo.setDataString("Hello there!");
        Observable o = new Observable(pojo);
        o.someMethod();


    }
}
