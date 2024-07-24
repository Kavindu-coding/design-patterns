package com.template;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){   //This is a hook
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;               //default implementation of the hook
    }                              // can be overridden in subclasses
}
