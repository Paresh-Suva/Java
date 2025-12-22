package com.paresh.LangPackage;

enum Season {
	WINTER, SUMMER, MONSOON, SPRING, FALL;
	
	private Season() {
		System.out.println(this.name());
	}
}

public class EnumDemo {
	public static void main(String[] args) {

		Season S = Season.FALL; 
		System.out.println("\n"+S); // FALL
		System.out.println(S.ordinal()); // 4 ; Explanation --> WINTER=0, SUMMER=1, ....., FALL=4
		System.out.println();
		
		Season List[] = Season.values();
		for (Season season : List) {
			System.out.println(season);
		}
		System.out.println();
		
		Season A = Season.WINTER;

		switch (A) {
		case WINTER:
			System.out.println("I am Winter...");
			break;
			
		case SUMMER:
			System.out.println("I am SUMMER...");

		case MONSOON:
			System.out.println("I am MONSOON...");

		case SPRING:
			System.out.println("I am SPRING...");

		case FALL:
			System.out.println("I am FALL...");

		default:
			System.out.println("Enter Valiod Input...");
			break;
		}

	}
}
