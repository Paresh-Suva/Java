package com.paresh.Methods;

import java.util.Scanner;

public class VotingEligibilityChecker {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int Age = Sc.nextInt();

		VoteChecker(Age);
		Sc.close();

	}

	public static void VoteChecker(int Age) {
		if (Age >= 18) {
			System.out.println("You're Eligible For Voting: ");
		} else {
			System.out.println("You're NOT Eligible For Voting: ");
		}
	}
}
