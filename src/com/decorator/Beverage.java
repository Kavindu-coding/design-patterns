package com.decorator;

public abstract class Beverage {
    String description = "Unknown com.decorator.Beverage";
    
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
