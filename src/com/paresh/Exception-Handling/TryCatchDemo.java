package com.paresh.ExceptionHandling;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0, denominator = 0;

        try {
            System.out.print("Enter the numerator: ");
            numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed... ");
            scanner.close();
        }

    }
}
