package com.paresh.Array;
import java.util.Scanner;
public class LargestProductFinder {
	public void LargestProduct() {

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
			int Product;
			Product = Arr[length-1]*Arr[length-2];
			System.out.println("Largest Product Of "+Arr[length-1]+" And "+ Arr[length-2]+" Is "+Product);
			sc.close();
	}
	public static void main(String[] args) {
		LargestProductFinder Q14 = new LargestProductFinder();
		Q14.LargestProduct();
	}

}