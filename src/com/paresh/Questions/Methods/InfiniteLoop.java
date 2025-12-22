                    //Infinite Loop
package com.paresh.Methods;

import java.util.Scanner;

public class InfiniteLoop {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int Number = Sc.nextInt();
		
		Infinite(Number);
		Sc.close();
	}
	public static void Infinite(int Number) {
		int Number2=Number;
		do {
			System.out.println("Hello This Is Infinite Loop: ");
		} while (Number2==Number);
	}
}
