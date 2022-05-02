package com.example.cv4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(JavaTestConfig.class)
@ActiveProfiles({"test"})
class Cv4ApplicationTests {

    @Autowired
    ApplicationContext apc;


    @Test
    public void testContextLoads() throws Exception {
        assertNotNull(this.apc);
    }

    @Test
    public void testtest()
    {
        myInterface mI = apc.getBean(myInterface.class);
        assertEquals("Answer1",mI.metoda());
    }



}



