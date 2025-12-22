//Write a program to convert all characters of a string to uppercase and lowercase.

package com.paresh.String;

import java.util.Scanner;

public class StringConvertCase {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Your String Here: ");
        String Str = Sc.nextLine();

        String toLowerCase = Str.toLowerCase();
        System.out.println("To Lower: "+toLowerCase);
        String toUpperCase = Str.toUpperCase();
        System.out.println("To Upper: "+toUpperCase);
        Sc.close();
    }
    
}
