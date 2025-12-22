//Write a program to count the number of vowels and consonants in a string.

package com.paresh.String;
import java.util.Scanner;

public class VowelAndConsonantCounter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String Name = Sc.nextLine().toUpperCase();

        Counter(Name);
        Sc.close();
    }
    public static void Counter(String string) {

        char[] Array1 = string.toCharArray();
        int count=0;
        for(int i=0;i<string.length();i++){
            if (Array1[i] == 'A' || Array1[i] == 'E' || Array1[i] == 'I' || Array1[i] == 'O' || Array1[i] == 'U') {
                count++;
            }
        }
        System.out.println("Number Of Vowels Is/Are: "+count);
        System.out.println("Number Of Constant Is/Are: "+(string.length()-count));
    }
}