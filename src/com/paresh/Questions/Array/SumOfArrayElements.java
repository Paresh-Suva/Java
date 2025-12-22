                    //sum of array elements
package com.paresh.Array;
import java.util.Scanner;

class SumOfArrayElements {
	
	public static void ArraySum() {

		int Sum = 0;
		System.out.print("Enter Length Of Array: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] Arr = new int[length];
		
		for (int i = 0; i < length; i++) {
			
			System.out.print("Enter Array Element "+ (i+1)+ " :");

			Arr[i] = sc.nextInt();
			Sum = Sum + Arr[i];
		}

		System.out.println("Sum Of Array Is: " + Sum);
		sc.close();
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
	    SumOfArrayElements Q1 = new SumOfArrayElements();
	    Q1.ArraySum();
	}

}
