package com.paresh.Pattern;

public class HollowRhomboidPattern {
	public static void main(String[] args) {
		int Number=5;
		
		for (int i = 1; i <=Number; i++) {
			
			for (int j = 1; j <=Number-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=Number; j++) {
				if (i==1||i==Number) {
					System.out.print("*");
				}
				else if (j==1||j==Number) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}
