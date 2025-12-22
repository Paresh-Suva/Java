package com.paresh.String;

import java.util.Scanner;

public class SubstringPalindromeFinder {

    public static boolean isPalindrome(String Checker){

        int i = 0;
        int j = Checker.length()-1;
        while (i<j) {
            if (Checker.charAt(i) != Checker.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("NOTE: Case Sensitive...");
        System.out.print("Enter Your First String Here: ");
        String Original = Sc.nextLine();

        int Count=0;
        for(int i=0; i<Original.length(); i++){

            for(int j=i+1; j<=Original.length(); j++){

                if (isPalindrome(Original.substring(i,j))==true) {
                    System.out.print(Original.substring(i,j)+" ");
                    Count++;
                }
            }
        }
        System.out.println();
        System.out.println("Number Of Palindromic String Are: "+Count);

        Sc.close();
    }
}