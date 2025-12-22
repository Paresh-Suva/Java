package com.paresh.Basics;

public class Loops {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Iteration: " + count);
            count++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int x = 1;
        do {
            System.out.println("Iteration: " + x);
            x++;
        } while (x <= 5);

        // Enhanced For Loop (For-Each Loop)
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
