                       // Reverse Array;
package com.paresh.Array;

import java.util.Scanner;

public class ReverseArray {
	public static void ArrayReverse() {
		System.out.print("Enter Length Of Array: ");

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] Arr = new int[length];
		int length2 = length;
		int[] RArr = new int[length2];

		for (int i = 0; i < length; i++) {

			System.out.println("Enter Array Element " + i + " :");
			Arr[i] = sc.nextInt();

		}

		for (int i = 0; i < length; i++) {
			RArr[i] = Arr[length2 - 1];
			length2--;
		}

		for (int i = 0; i < length; i++) {

			System.out.println("Array Element At " + i + " Index: " + RArr[i]);

		}
		sc.close();

	}

	public static void main(String[] args) {

		ReverseArray.ArrayReverse();
	}

}
