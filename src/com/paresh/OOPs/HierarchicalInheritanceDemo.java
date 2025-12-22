package com.paresh.OOPs;

// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Child class 1
class Circle extends Shape {
    void area() {
        System.out.println("Calculating area of Circle...");
    }
}

// Child class 2
class Rectangle extends Shape {
    void area() {
        System.out.println("Calculating area of Rectangle...");
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw(); // Inherited method from Shape
        myCircle.area(); // Method of Circle

        Rectangle myRectangle = new Rectangle();
        myRectangle.draw(); // Inherited method from Shape
        myRectangle.area(); // Method of Rectangle
    }
}
