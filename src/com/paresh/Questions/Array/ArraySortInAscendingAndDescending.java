package com.paresh.Array;

import java.util.Scanner;

public class ArraySortInAscendingAndDescending {
	//Array Sort In Ascending And Descending;
		public static void ArraySort() {
		System.out.print("Enter Length Of Array: ");
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int[] Arr = new int[length];
		
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Array Element " + i + " :");
			Arr[i] = sc.nextInt();
		}
	    int Ac=0;
		for(int i = 0;i<length; i++) {
			for(int j=i+1;j<length;j++) {
				if(Arr[i]>Arr[j]) {
					Ac = Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=Ac;
				}
			}
			
		}
		System.out.println("Ascending Array: ");
	    for(int i=0;i<length;i++) {
			System.out.print(Arr[i]+" ");
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
	    System.out.println();
	    System.out.println("Descending  Array: ");
		for(int i=0;i<length;i++) {
			
			System.out.print(Arr[i]+ " ");
		}
		sc.close();

		}
		
		public static void main(String[] args) {
			ArraySortInAscendingAndDescending.ArraySort();
			
		}

}
