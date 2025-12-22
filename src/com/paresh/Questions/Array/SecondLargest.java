package com.paresh.Array;

import java.util.Scanner;

public class SecondLargest {
	// Array Second Largest Finder;
		public static void ArraySecondLargest() {

			System.out.print("Enter Length Of Array: ");

			Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();//Take User input Size;
			int[] Arr = new int[length];//Initializes Array & Size;
			int Ac=0;//Create Third variable to use in swapping; 

			for (int i = 0; i < length; i++) {//Take user input in array;

				System.out.print("Enter Array Element " + i + " :");
				Arr[i] = sc.nextInt();

			}
			
			for(int i = 0;i<length; i++) {//Convert array into ascending order;
				for(int j=i+1;j<length;j++) {
					if(Arr[i]>Arr[j]) {
						Ac = Arr[i];
						Arr[i]=Arr[j];
						Arr[j]=Ac;
					}
				}
				
			}
			System.out.println("Second Largest Element Is: "+Arr[length-2]);//Print Last to sec. element;
			sc.close();
			
		}
		
		public static void main(String[] args) {
			SecondLargest.ArraySecondLargest();
		}

}
