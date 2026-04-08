package com.paresh.abstracts;


class Car extends Vehicles {

    @Override
    public void method() {

    }
}

public class AbstractDemo {

    static void main(String[] args) {

        // Vehicles Vehicles = new Vehicles(); --> Compiletime Error
        Car car = new Car();
        car.method();
    }
}
