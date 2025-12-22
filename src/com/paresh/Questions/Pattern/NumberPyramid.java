package com.paresh.Pattern;

import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int n = Sc.nextInt();
		int p=1;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <=i; j++) {
				
					System.out.print(p+" ");
					p++;
				
			}
			System.out.println();
			
		}
		Sc.close();
	}

}
