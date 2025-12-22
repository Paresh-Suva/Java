package com.paresh.Methods;

import java.util.Scanner;

public class FindGreaterNumber {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int First = Sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int Second = Sc.nextInt();
		
		GreaterFinder(First,Second);
		Sc.close();
	}
	public static int GreaterFinder(int a, int b) {
		
		if(a>b){
			System.out.println(a+ " Is GreaterThan "+b);
		}
		else if (a<b) {
			System.out.println(b+ " Is GreaterThan "+a);
		}
		else {
			System.out.println("Both Are Same: ");
		}
		return 0;
	}
	
}
