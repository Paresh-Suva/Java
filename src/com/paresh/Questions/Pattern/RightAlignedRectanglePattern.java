package com.paresh.Pattern;

public class RightAlignedRectanglePattern {
	public static void main(String[] args) {
		int Number=5;
		
		for (int i = 0; i < Number; i++) {
			
			for (int j = 0; j < Number-i; j++) {
				System.out.print(" ");	
			}
			
			for (int j = 0; j < Number; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
