package com.example.cv4;

import org.springframework.stereotype.Component;

@Component
public class Furniture {

    private int id;
    private String brand;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void build()
    {
        System.out.println("furniture moved");
    }
}
