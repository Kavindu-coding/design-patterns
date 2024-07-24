package com.decorator;

public class SteamedMilk extends CondimentDecorator{
    Beverage beverage;
    public SteamedMilk(Beverage beverage){this.beverage = beverage;}
    public double cost() {return 0.10 + beverage.cost();}
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";}
}
