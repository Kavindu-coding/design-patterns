package com.decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "house blend cofee";
    }
    
    public double cost(){
        return 0.89;
    }
}
