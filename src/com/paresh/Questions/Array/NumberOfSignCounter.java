package com.paresh.Array;
import java.util.Scanner;
public class NumberOfSignCounter {
	public void NumberChecker() {
		System.out.print("Enter Length Of Array: ");
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int[] Arr = new int[length];
		int Count1=0,Count2=0,Count3=0;
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Array Element " + i + " :");
			Arr[i] = sc.nextInt();
		}
		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i]>0) {
				Count1++;
			}
			else if (Arr[i]<0) {
				Count2++;
			}
			else {
				Count3++;
			}
		}
		System.out.println("Total Positive Number In Array Is: "+Count1);
		System.out.println("Total Negative Number In Array Is: "+Count2);
		System.out.println("Total Zero/s In Array Is: "+Count3);
		sc.close();
	}
	public static void main(String[] args) {
		NumberOfSignCounter Q15 =new NumberOfSignCounter();
		Q15.NumberChecker();
	}

}
