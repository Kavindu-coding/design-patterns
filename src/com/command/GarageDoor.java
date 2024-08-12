package com.command;

// Concrete receiver for a TV
public class GarageDoor implements Device {
    public void turnOn() {
        System.out.println("door light is on");
    }

    @Override
    public void turnOff() {
        System.out.println("door light is off");
    }

    public void up() {
        System.out.println("door going up");
    }

    public void down() {
        System.out.println("door going down");
    }

    public void stop() {
        System.out.println("door stop");
    }
}
