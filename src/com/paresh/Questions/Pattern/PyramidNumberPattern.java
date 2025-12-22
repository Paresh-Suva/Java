package com.paresh.Pattern;

public class PyramidNumberPattern {
	public static void main(String[] args) {
		int Number=5;
		
		for (int i = 1; i <= Number; i++) {//Rows
			
			for (int j = 1; j <=Number-i; j++) {//Space
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {//Number
					
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
