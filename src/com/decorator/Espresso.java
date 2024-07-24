package com.decorator;

public class Espresso extends Beverage {
    public Espresso(){
        description = "com.decorator.Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
