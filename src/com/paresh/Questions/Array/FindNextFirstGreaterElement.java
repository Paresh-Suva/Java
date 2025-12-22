// Given an array, find the next first greater element for each element. 
//If none exists, return -1.

//Input: [4, 5, 2, 10]
//Output: [5, 10, 10, -1]
package com.paresh.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNextFirstGreaterElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Array Size: ");
		int n = scanner.nextInt();

		int[] array = new int[n];// User Input Store In This Array
		ArrayList<Integer> list = new ArrayList<>();// Output Store In This Array

		// Loop For Talking INPUT
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + " Element: ");
			array[i] = scanner.nextInt();
		}
		
		int a = -1;
		// LOOP for OUTPUT
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = i+1; j < array.length; j++) {
				
				if (array[j]>array[i]) {
					
					list.add(array[j]);
					count++;
					break;
				}
			}
			if (count==0) {
				list.add(a);
			} 
		}
		
		//Printing Output
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		scanner.close();
	}
}
