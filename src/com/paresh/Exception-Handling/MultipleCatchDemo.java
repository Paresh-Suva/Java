package com.paresh.ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);

            System.out.print("Enter an array index (0-2): ");
            int index = scanner.nextInt();
            int[] numbers = {10, 20, 30};

            System.out.println("Value at index " + index + ": " + numbers[index]);

        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("ArithmeticException caught: Cannot divide by zero.");
       
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles invalid array index
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index.");
       
        } catch (Exception e) {
            // Handles all other exceptions
            System.out.println("Exception caught: " + e.getMessage());
      
        } finally {
            System.out.println("Finally block executed....");
            scanner.close();
        }
    }
}
