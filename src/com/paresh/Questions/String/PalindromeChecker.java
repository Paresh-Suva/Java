//Write a program to check if a string is a palindrome.

package com.paresh.String;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Your String Here: ");
        String original = Sc.nextLine();
        String String1 = original.toLowerCase();

        boolean isPalindrome = checkPalindrome(String1);

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        Sc.close();
    }

    public static boolean checkPalindrome(String str) {

        for (int i = 0; i <  str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt( str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}