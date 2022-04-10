package com.example.cv4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan
public class JavaTestConfig {

    @Autowired
    private myInterface mI;

    @PostConstruct
    public void test()
    {
        System.out.println("Loaded test enviroment");

    }
}
