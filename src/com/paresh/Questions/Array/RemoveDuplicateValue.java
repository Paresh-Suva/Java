package com.paresh.Array;

import java.util.Scanner;

public class RemoveDuplicateValue {
	// Remove Duplicate Value From Array
    public static void ArrayRemoveDuplicate() {
        System.out.print("Enter Length Of Array: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] Arr = new int[length];

        // Input array elements
        for (int i = 0; i < length; i++) {
            System.out.print("Enter Array Element " + i + ":");
            Arr[i] = sc.nextInt();
        }

        // Remove duplicates by marking duplicates with a special value (-1)
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Arr[i] == Arr[j]) {
                    Arr[j] = -1; // Duplicate = -1;
                }
            }
        }

        // Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (Arr[i] != -1) {
                uniqueCount++;
            }
        }

        // Create a new array with unique elements
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (Arr[i] != -1) {
                uniqueArray[index++] = Arr[i];
            }
        }

        // Print the unique array
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        sc.close();
    }
    public static void main(String[] args) {
		RemoveDuplicateValue.ArrayRemoveDuplicate();
	}

}
