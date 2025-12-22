//Write a program to reverse a string.

package com.paresh.String;
import java.util.Scanner;
public class StringReverser {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Your String Here: ");
        String Str = Sc.nextLine();//Taking Input String

        String Reversed = ReverseString(Str);//Calling reverse String Method And Stroring In Reversed
        System.out.println(Reversed);//Printing Reversed String

        Sc.close();//Closing Scanner
    }

    public static String ReverseString(String str) {
        char[] chars = str.toCharArray();//Converting String Into char Array
        String reversed = "";//Declering Array For Storing String Char
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];//Dtoring All Char In To Reversed
        }
        return reversed;//returning String
    }
    
     
}