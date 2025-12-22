package com.paresh.Array;

import java.util.Scanner;

public class SecondSmallest {
	
		public static void ArraySecondSmallest() {
			System.out.println("Array Second Smallest Element Finder;");

			System.out.print("Enter Length Of Array: ");
			Scanner sc = new Scanner(System.in);

			int length = sc.nextInt();
			int[] Arr = new int[length];
			int Ac=0;

			for (int i = 0; i < length; i++) {
				System.out.print("Enter Array Element " + i + " :");
				Arr[i] = sc.nextInt();
			}
			
			for(int i = 0;i<length; i++) {
				for(int j=i+1;j<length;j++) {
					if(Arr[i]<Arr[j]) {
						Ac = Arr[i];
						Arr[i]=Arr[j];
						Arr[j]=Ac;
					}
				}
				
			}
			
			System.out.println("Array Second Smallest Element Is: "+Arr[length-2]);
			sc.close();
		}
		
		public static void main(String[] args) {
			
			SecondSmallest.ArraySecondSmallest();
		
		}


}
