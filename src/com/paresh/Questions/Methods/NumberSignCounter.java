package com.paresh.Methods;

import java.util.Scanner;

public class NumberSignCounter {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("How Many Number You Want To Enter: ");
		int Number= Sc.nextInt();
		
		NumberChecker(Number);
		Sc.close();
	}
	public static void NumberChecker(int Number) {
		
		int[] Array = new int[Number];
		Scanner Sc = new Scanner(System.in);
		
		for (int i = 0; i < Number; i++) {
			System.out.print("Enter "+(i+1)+" Number: ");
			Array[i]= Sc.nextInt();
		}
		int Positive=0;
		int Negative=0;
		int Zero=0;
		
		for (int i = 0; i < Array.length; i++) {
			if (Array[i]==0) {
				Zero++;
			} else if(Array[i]>0){
				Positive++;
			}else {
				Negative++;
			}
		}
		System.out.println("Total Zero's In Your Numbers Is/Are: "+Zero);
		System.out.println("Total Positive Number In Your Number Is/Are: "+Positive);
		System.out.println("Total Negative Number In Your Number Is/Are: "+Negative);
		Sc.close();
		
	}

}
