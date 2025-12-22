              //Find The Largest Element In Array;
package com.paresh.Array;

import java.util.Scanner;

public class LargestElement {
	public static void ArraySmallLarge() {
		
		System.out.print("Enter Length Of Array: ");
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] Arr = new int[length];
		
		for (int i = 0; i < length; i++) {
			
			System.out.print("Enter Array Element "+ i + " :");
			Arr[i] = sc.nextInt();
		
		}
		int Maximum = Arr[0];
		int Minimum = Arr[0];
		
		
		for(int i=0;i<length;i++) {
			if(Maximum<Arr[i]) {
				Maximum = Arr[i];
			}
			if(Minimum>Arr[i]) {
				Minimum = Arr[i];
			}
		}

		System.out.println("Largest Element From Array Is: " + Maximum);
		System.out.println("Smallest Element From Array Is: " + Minimum);
		sc.close();
	}
	
	public static void main(String[] args) {
		LargestElement.ArraySmallLarge();
		
	}


}
