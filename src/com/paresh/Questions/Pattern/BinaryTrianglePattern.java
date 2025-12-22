package com.paresh.Pattern;

import java.util.Scanner;

public class BinaryTrianglePattern {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = Sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <=i; j++) {
				if ((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		Sc.close();
	}

}
