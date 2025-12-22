package com.paresh.Basics;

public class ControlStatements {
    public static void main(String[] args) {
        int number = 15;

        // if statement
        if (number > 10) {
            System.out.println("Number is greater than 10.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

        // nested-if statement
        if (number > 0) {
            if (number < 100) {
                System.out.println("Number is a positive two-digit number.");
            }
        }

        // if-else-if ladder
        if (number < 0) {
            System.out.println("Number is negative.");
        } else if (number == 0) {
            System.out.println("Number is zero.");
        } else if (number <= 10) {
            System.out.println("Number is positive and small.");
        } else {
            System.out.println("Number is positive and large.");
        }

        // switch-case
        switch (number % 2) {
            case 0:
                System.out.println("Number is even (checked using switch-case).");
                break;
            case 1:
                System.out.println("Number is odd (checked using switch-case).");
                break;
            default:
                System.out.println("Unexpected value.");
        }

        // Jump statements
        System.out.println("Demonstrating 'continue' and 'break':");
        for (int i = 1; i <= 5; i++) {
            if (i == 2) continue; // Skips the current iteration when i is 2
            if (i == 4) break;    // Exits the loop when i is 4
            System.out.println("i = " + i);
        }

        System.out.println("Returning from the method now.");
        return; // Ends the method execution
    }
}
