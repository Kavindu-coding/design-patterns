package com.adaptor;

public class Main {
    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says.....");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says.....");
        testDuck(duck);

        System.out.println("\n The TurkeyAdapter says......");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}