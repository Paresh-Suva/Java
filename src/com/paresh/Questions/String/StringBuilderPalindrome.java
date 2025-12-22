//Check String Is Pallindrome Or Not ?? 
package com.paresh.String;

import java.util.Scanner;

public class StringBuilderPalindrome {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("NOTE: Case Sensitive...");
        System.out.print("Enter Your First String Here: ");
        String Original = Sc.nextLine();
        Sc.close();

        //METHOD 1
        StringBuilder Str1 = new StringBuilder(Original);
        String Reversed = Str1.reverse()+"";
        
        if (Reversed.equals(Original)) {
            System.out.println("String Is Palindrome...");
        }
        else{
            System.out.println("String Is Not Palindrome...");

        }

        //METHOD 2
        int i = 0;
        int j = Original.length()-1;
        boolean Flage = true;
        while (i<j) {
            if (Original.charAt(i) != Original.charAt(j)) {
                System.out.println("String Is Not Palindronme...");
                Flage = false;
                break;
            }
            i++;
            j--;
        }
        if (Flage == true) {
            System.out.println("String Is Palindrome...");
        }


    }
}
