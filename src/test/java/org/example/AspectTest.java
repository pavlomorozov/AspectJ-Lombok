package org.example;

import org.junit.Test;

public class AspectTest {

    @Test
    public void aspectTest() {
        POJO pojo = new POJO();
        pojo.setDataString("Hello test!");
        Observable o = new Observable(pojo);
        o.someMethod();
    }

}
