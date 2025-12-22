package com.paresh.Basics;

public class Arrays {
	public static void main(String[] args) {
		
		/* Single Dimension Array In Java */
		
		@SuppressWarnings("unused")
		int[] Array1;// Array creation
		Array1 = new int[10];// Assign Size

		int Array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// Declaration, Instantiation and Initialization

		// Printing Array Element Using ForEach Loop
		System.out.println("Single Dimension Array: ");
		for (int i : Array2) {
			System.out.print(i+" ");
		}
        System.out.println("\n");
        
        
        
		/* Multi-Dimension Array In Java*/
        
		// A multidimensional array in Java is an array of arrays where
		// each element can be an array itself. It is useful for storing
		// data in row and column format.

		int[][] Array3 = new int[3][3];// 3x3 Array
		// Initialize Multidimensional Array
		Array3[0][0] = 1;
		Array3[0][1] = 2;
		Array3[0][2] = 3;
		Array3[1][0] = 4;
		Array3[1][1] = 5;
		Array3[1][2] = 6;
		Array3[2][0] = 7;
		Array3[2][1] = 8;
		Array3[2][2] = 9;

		// Printing the 2D array
		System.out.println("Multi-Dimension Array: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(Array3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		
		
		/* Jagged Arrays In Java */
		
		//In Java, a jagged array is an array of arrays where each row of 
		//the array can have a different number of columns. This contrasts
		//with a regular two-dimensional array, where each row has the same 
		//number of columns
		
		 //Declaring A 2D Array With Odd Columns  
        int Array4[][] = new int[4][]; 
        
        //In 1st Row There Are 2 Columns
        Array4[0] = new int[2]; 
        //In 2nd Row There Are 3 Columns
        Array4[1] = new int[3];  
        //In 3rd Row There Are 4 Columns
        Array4[2] = new int[4];  
       //In 3rd Row There Are 5 Columns
        Array4[3] = new int[5];
        
        //Initializing A jagged Array  
        int count = 0;  
        for (int i=0; i<Array4.length; i++)// 
            for(int j=0; j<Array4[i].length; j++)  
                Array4[i][j] = count++;  
   
        //Printing The Data Of A Jagged Array 
        System.out.println("Jagged Array: ");
        for (int i=0; i<Array4.length; i++){  
            for (int j=0; j<Array4[i].length; j++){  
                System.out.print(Array4[i][j]+" ");  
            }  
            System.out.println(); 
        }  
	}
}
