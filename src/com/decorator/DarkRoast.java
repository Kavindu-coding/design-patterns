package com.decorator;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "dark roast cofee";
    }

    public double cost(){
        return 0.99;
    }
}
