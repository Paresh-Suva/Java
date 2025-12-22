package com.paresh.Methods;

import java.util.Scanner;

public class GCDFinder {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int First=  Sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int Second=  Sc.nextInt();
		
		Divisor(First,Second);
		Sc.close();
	}
	public static void Divisor(int First,int Second) {
		while (First != Second) {
			if (First>Second) {
				
				First =First - Second;
			}else {
				Second =Second - First;
			}
			
		}
		System.out.println("GCD Is: "+Second);
	}
}
