package com.paresh.Pattern;

import java.util.Scanner;

public class SequentialNumberPyramid {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = Sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		Sc.close();
	}

}
