                         // Palindromic Pattern
package com.paresh.Pattern;

public class PalindromicPattern {
	public static void main(String[] args) {
		int Number=5;
		
		for (int i = 1; i <=Number; i++) {
			
			for (int j = 1; j <=Number-i; j++) {//Space
				System.out.print(" ");
			}
			
			for (int j = i; j >=1; j--) {
				System.out.print(j);
			}
			
			for (int j = 2; j <=i ; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
