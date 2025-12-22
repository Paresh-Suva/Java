package com.paresh.Abstract;

abstract class Animal {
    String name;
    
    public Animal(String name) {
    	this.name = name;
    }

    // com.paresh.Abstract method
    abstract void sound();

    // Non-com.paresh.Abstract method
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
		super(name);
	}

	// Implementing the abstract method
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
		super(name);
	}

	void sound() {
        System.out.println("Cat meows.");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        dog.sound();
        dog.eat();

        Animal cat = new Cat("Kitty");
        cat.sound();
        cat.eat();
    }
}
