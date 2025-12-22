package com.paresh.Array;

import java.util.Scanner;

public class MargArray {
	
	public static void ArrayMarg() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Length Of First Array: ");
		int length1 = sc.nextInt();
		int[] Arr1 = new int[length1];

		for (int i = 0; i < length1; i++) {
			System.out.print("Enter Array Element " + i + " :");
			Arr1[i] = sc.nextInt();
		}

		System.out.print("Enter Length Of Second Array: ");
		int length2 = sc.nextInt();
		int[] Arr2 = new int[length2];
		int length = length1 + length2;
		int[] MargArray = new int[length];
		int Ac = 0;

		for (int i = 0; i < length2; i++) {
			System.out.print("Enter Array Element " + i + " :");
			Arr2[i] = sc.nextInt();
		}

		for (int i = 0; i < length; i++) {
			if (i < length1) {
				MargArray[i] = Arr1[i];
			} else {
				MargArray[i] = Arr2[Ac];
				Ac++;
			}
		}
		System.out.print("Merged Array Is: ");

		for (int i = 0; i < length; i++) {
			System.out.print(MargArray[i] + " ");
		}
		sc.close();

	}
	
	public static void main(String[] args) {
		MargArray.ArrayMarg();
	}

}
