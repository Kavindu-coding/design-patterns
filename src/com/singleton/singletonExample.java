package com.singleton;

public class singletonExample {
    public static void main(String[] args){
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        object1.showMessage();
        object2.showMessage();
    }
}
