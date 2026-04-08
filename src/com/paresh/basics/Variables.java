package com.paresh.basics;

public class Variables {
    // Static variable
    static int staticVar = 20;
    // Instance variable
    int instanceVar = 10;

    public static void displayStaticVariable() {
        System.out.println("Static Variable: " + staticVar);
    }

    static void main(String[] args) {
        // Local variable
        int localVar = 30;
        System.out.println("Local Variable: " + localVar);

        Variables obj = new Variables();
        obj.displayInstanceVariable();

        displayStaticVariable();

        // Final variable (constant)
        final int finalVar = 40;
        System.out.println("Final Variable: " + finalVar);
    }

    public void displayInstanceVariable() {
        System.out.println("Instance Variable: " + instanceVar);
    }
}
