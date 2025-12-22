package com.paresh.Array;

import java.util.Scanner;

public class DivisionOfArray {
	public void ArrayDivision() {
		System.out.print("Enter Length Of Array: ");
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		int[] Arr = new int[length];
		
		int length1 = length/2;
		int[] Arr1 = new int[length1];
		
		int length2 = length-length1;	
		int[] Arr2 = new int[length2];
		
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Array Element " + i + " :");
			Arr[i] = sc.nextInt();
		}
		for (int i = 0; i < Arr1.length; i++) {
			Arr1[i]=Arr[i];
		}
		for (int i = 0; i < Arr2.length; i++) {
			Arr2[i]=Arr[length1];
			length1++;
		}
		System.out.println("First Array: ");
		for (int i = 0; i < Arr1.length; i++) {
		System.out.print(Arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Second Array: ");
		for (int i = 0; i < Arr2.length; i++) {
		System.out.print(Arr2[i]+" ");
		}
		sc.close();

	}

	public static void main(String[] args) {
		DivisionOfArray Q16 = new DivisionOfArray();
		Q16.ArrayDivision();
	}

}
