package com.paresh.Pattern;

import java.util.Scanner;

public class InvertedHalfPyramid {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Hight Of Triangle: ");
		int n = Sc.nextInt();

		// Inverted Half Pyramid;
		System.out.println("Inverted Half Pyramid: ");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		Sc.close();
	}
}
