package com.paresh.Array;

import java.util.Scanner;

public class SumOfOddeven {
	public static void ArrayOddEven() {

		System.out.print("Enter Length Of Array: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] Arr = new int[length];
		int EvenSum = 0;
		int OddSum = 0;

		// Input array elements
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Array Element " + i + ":");
			Arr[i] = sc.nextInt();
		}
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				EvenSum += Arr[i];
			} else {
				OddSum += Arr[i];
			}
		}
		System.out.println("Sum Of Even Indices Is: " + EvenSum);
		System.out.println("Sum Of Odd Indices Is: " + OddSum);
		sc.close();
	}

	public static void main(String[] args) {
		SumOfOddeven.ArrayOddEven();

	}

}
