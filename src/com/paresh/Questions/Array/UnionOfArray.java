package com.paresh.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfArray {
	public static void ArrayUnion() {
		System.out.print("Enter Length Of First Array: ");
		Scanner sc = new Scanner(System.in);
		int length1 = sc.nextInt();
		int[] Array1 = new int[length1];

		for (int i = 0; i < length1; i++) {
			System.out.print("Enter Array Element " + i + " :");
			Array1[i] = sc.nextInt();
		}

		System.out.print("Enter Length Of Second Array: ");
		int length2 = sc.nextInt();
		int[] Array2 = new int[length2];

		for (int i = 0; i < length2; i++) {
			System.out.print("Enter Array Element " + i + " :");
			Array2[i] = sc.nextInt();
		}
		ArrayList<Integer> Result = new ArrayList<>();

		for (int i = 0; i < length1; i++) {
			Result.add(i, Array1[i]);
		}
		int l=length1-1;
			for (int j = 0; j < length2; j++) {
				Result.add(l+1, Array2[j]);
				l++;
			}
		
        System.out.print("Final Array Is: ");
		int Size = Result.size();
		for (int i = 0; i < Size; i++) {
			System.out.print( Result.get(i) + " ");
		}
	
		sc.close();
	}

	public static void main(String[] args) {
		UnionOfArray.ArrayUnion();
	}


}
