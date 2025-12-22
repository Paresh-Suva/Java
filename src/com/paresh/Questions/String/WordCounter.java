//Write a program to count the number of words in a string.

package com.paresh.String;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your string here: ");
        String Input = Sc.nextLine();

        CountWords(Input);
        Sc.close();
    }
    public static void CountWords(String str){
        int Result=1;
        char[] charArray = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if (charArray[i]==' ') {
                Result++;
            }
        }
        System.out.println("Total Numbers Of Words"+Result);

    }
}
