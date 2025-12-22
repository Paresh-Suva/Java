package com.paresh.Abstract;


class Car extends Vehicles {

    @Override
    public void method() {

    }
}

public class AbstractDemo {

	public static void main(String[] args) {

		// Vehicles Vehicles = new Vehicles(); --> Compiletime Error
		Car car = new Car();
		car.method();
	}
}
