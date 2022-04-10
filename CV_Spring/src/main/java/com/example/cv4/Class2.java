package com.example.cv4;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Default")
public class Class2 implements myInterface {

    @Override
    public String metoda() {
        return "Answer2";
    }
}
