package com.paresh.Pattern;

public class ButterflyPattern {
	public static void main(String[] args) {
		int Number = 4;

		for (int i = 1; i <= Number; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			int Space = 2 * (Number - i);
			for (int j = 1; j <= Space; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = Number; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			int Space = 2 * (Number - i);
			for (int j = 1; j <= Space; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}