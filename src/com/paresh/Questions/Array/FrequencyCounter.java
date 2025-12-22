package com.paresh.Array;

import java.util.Scanner;

public class FrequencyCounter {
	//Frequency Count In Array;
		public static void ArraySameNo() {
			System.out.print("Enter Length Of Array: ");

			Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			int visited = -1;
			int[] Arr = new int[length];
			int[] Count = new int[Arr.length];

			for (int i = 0; i < length; i++) {

				System.out.print("Enter Array Element " + i  + " :");
				Arr[i] = sc.nextInt();

			}
			
			for (int i = 0; i < Arr.length; i++) {
				int Repeat = 1;
				for (int j = i + 1; j < Arr.length; j++) {
					if (Arr[i] == Arr[j]) {
						Repeat++;
						
						Count[j] = visited;
					}
				}
				if (Count[i] != visited)
					Count[i]= Repeat;
			}
			
			for(int i = 0; i < Count.length; i++){  
	            if(Count[i] != visited)  
	                System.out.println(
	                		Arr[i] + " Repeated " + Count[i]+ " Times ");  
	        }  
			sc.close();

		}
		
		public static void main(String[] args) {
			FrequencyCounter.ArraySameNo();
			
		}
	

}
