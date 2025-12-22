package com.paresh.Questions.Array;

import java.util.Scanner;

public class ArrayLeftShifter {

	public static void ArrayLeftShift() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Length Of Array: ");
		int length1 = sc.nextInt();
		int[] Arr1 = new int[length1];

		for (int i = 0; i < length1; i++) {
			System.out.print("Enter Array Element " + i + " :");
			Arr1[i] = sc.nextInt();
		}
		System.out.print("Enter Number To Left Shift: ");
		int Left = sc.nextInt();
		int LeftArray[] = new int[length1];
		for (int i = 0; i < length1 - Left; i++) {
			LeftArray[i] = Arr1[Left + i];

		}

		for (int i = 0; i < Left; i++) {
			LeftArray[(length1 - Left) + i] = Arr1[i];
		}
		for (int i = 0; i < length1; i++) {
			System.out.print(LeftArray[i] + " ");
		}

		System.out.print("Enter Number To Right Shift: ");
		int Right = sc.nextInt();
		int RightArray[] = new int[length1];

		for (int i = 0; i < Right; i++) {
			RightArray[i] = Arr1[(length1 - Right) + i];

		}
		for (int i = 0; i < length1 - Right; i++) {
			RightArray[Right + i] = Arr1[i];
		}

		for (int i = 0; i < length1; i++) {
			System.out.println(RightArray[i]);
		}
		sc.close();

	}

	public static void main(String[] args) {
		ArrayLeftShifter.ArrayLeftShift();

	}

}
