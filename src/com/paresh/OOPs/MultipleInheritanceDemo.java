package com.paresh.OOPs;

// First interface
interface Animal {
    void eat(); // com.paresh.Abstract method
}

// Second interface
interface Bird {
    void fly(); // com.paresh.Abstract method
}

// Class implementing both interfaces
class Bat implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying...");
    }
}

// Main class
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat(); // From Animal interface
        bat.fly(); // From Bird interface
    }
}
