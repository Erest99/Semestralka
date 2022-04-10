package com.example.cv4;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class Class1 implements myInterface {

    @Override
    public String metoda() {
        return "Answer1";
    }
}
