package com.paresh.OOPs;

// Parent class
class Person {
    String name;

    // Constructor of Person class
    public Person(String name) {
        this.name = name; // Using 'this' to assign the parameter to the instance variable
        System.out.println("Person constructor called!");
    }

    // Method in parent class
    public void display() {
        System.out.println("Parent class (Person): Name is " + name);
    }
}

// Child class
class Male extends Person {
    int rollNumber;

    // Constructor of Student class
    public Male(String name, int rollNumber) {
        super(name); // Calls the constructor of the parent class (Person)
        this.rollNumber = rollNumber;
        System.out.println("Student constructor called!");
    }

    // Method in child class
    public void display() {
        super.display(); // Calls the parent class method
        System.out.println("Child class (Student): Roll Number is " + this.rollNumber);
    }
}

// Main class
public class ThisAndSuperDemo {
    public static void main(String[] args) {
        // Creating a Student object
        Male male = new Male("Paresh", 101);

        // Calling display method
        male.display();
    }
}
