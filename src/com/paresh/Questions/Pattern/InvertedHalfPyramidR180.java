package com.paresh.Pattern;

import java.util.Scanner;

public class InvertedHalfPyramidR180 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Hight Of Triangle: ");
		int n = Sc.nextInt();

		// Inverted Half Pyramid With R180.;
		System.out.println("Inverted Half Pyramid With R180: ");
		for (int i = 1; i <= n; i++) {
			// Printing Space;
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		Sc.close();
	}
}
