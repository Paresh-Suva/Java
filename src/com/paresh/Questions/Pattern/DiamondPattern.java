//Diamond Pattern;
package com.paresh.Pattern;

public class DiamondPattern {
	public static void main(String[] args) {
		int Number = 5;

		for (int i = 1; i <= Number; i++) {

			for (int j = 1; j <= Number - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 2; j < i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = Number-1; i>=1; i--) {

			for (int j = 1; j <= Number - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 2; j < i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
