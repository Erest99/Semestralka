package com.example.cv4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("test")
@Configuration
public class JavaTestConfig {

    public String aw_name = "furniture";

    @PostConstruct
    public void test()
    {
        System.out.println("Loaded test enviroment");

    }
}
