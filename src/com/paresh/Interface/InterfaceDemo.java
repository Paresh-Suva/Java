package com.paresh.Interface;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started...");
    }
    public void stop() {
        System.out.println("Car Stopped...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started...");
    }
    public void stop() {
        System.out.println("Bike Stopped...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bicycle = new Bike();
        bicycle.start();
        bicycle.stop();
    }
}

