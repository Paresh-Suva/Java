package com.paresh.String;

import java.util.Scanner;

public class CheckIfOnlyDigits {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your string here: ");
        String Name = Sc.nextLine();

        boolean isIt = containsOnlyDigits(Name);
        System.out.println("The String Contain Only Digit: "+isIt);

        Sc.close();
    }
    public static boolean containsOnlyDigits(String str) {
        // Check each character to see if it is a digit
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }    
}
