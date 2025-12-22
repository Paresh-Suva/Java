package com.paresh.Methods;

import java.util.Scanner;

public class PowerFinder {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Base Number: ");
		int X = Sc.nextInt();
		System.out.print("Enter Exponential Number: ");
		int N = Sc.nextInt();
		
		Power(X,N);
		Sc.close();
	}
	public static void Power(int X, int N) {
		int Result=1;
		for (int i = 1; i <= N; i++) {
			Result=Result*X;
		}
		System.out.println(" Output: "+ Result);
	}

}
