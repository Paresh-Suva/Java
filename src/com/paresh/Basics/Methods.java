package com.paresh.Basics;

public class Methods {

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    // Parameterized method
    public void parameterizedMethod(int number) {
        System.out.println("This is a parameterized method. Number = " + number);
    }

    // Return method
    public String returnMethod() {
        return "This method returns a string.";
    }

    // Void method
    public void voidMethod() {
        System.out.println("This is a void method. It does not return anything.");
    }

    public static void main(String[] args) {
        staticMethod();

        Methods methods = new Methods();

        methods.instanceMethod();

        methods.parameterizedMethod(42);

        String returnedValue = methods.returnMethod();
        System.out.println("Return method output: " + returnedValue);

        methods.voidMethod();

    }
}
