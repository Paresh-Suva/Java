//Hollow Square OR Rectangle;
package com.paresh.Pattern;

import java.util.Scanner;

public class HollowSquareOrRectangle {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int Length = Sc.nextInt();

		System.out.print("Enter Width: ");
		int Width = Sc.nextInt();

		for (int i = 1; i <= Length; i++) {

			for (int j = 1; j <= Width; j++) {
				
				if(i==1 || j==1 || i==Length || j==Width) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		Sc.close();

	}
}
