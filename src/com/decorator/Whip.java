package com.decorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return 0.10 + beverage.cost();
    }
    public String getDescription() {
        return beverage.getDescription() + ", com.decorator.Whip";
    }
}
