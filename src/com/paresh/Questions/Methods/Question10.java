package com.paresh.Methods;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int Number = Sc.nextInt();
		int FS1 = 0;
		int FS2 = 1;
		int Result = 1;

		System.out.print(FS1 + " ");

		for (int i = 0; i < Number; i++) {

			System.out.print(Result + " ");

			Result = FS1 + FS2;
			FS1 = FS2;
			FS2 = Result;
		}
		Sc.close();
	}
}
