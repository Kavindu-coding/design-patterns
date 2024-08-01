package com.singleton;

public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){}
    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Method to demonstrate the Singleton functionality
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}
