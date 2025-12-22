//Write a program to remove all vowels from a string.
package com.paresh.String;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your string here: ");
        String Name = Sc.nextLine();

        String Result =RemoveVowels(Name);

        System.out.println("Original String: "+Name);
        System.out.println("Vowels Removed String: "+Result);

        Sc.close();
    }
    public static String RemoveVowels(String str){
        String RemovedVowels = "";
        char[] charArray = str.toCharArray();

        for(int i = 0; i<str.length();i++){
            if(charArray[i] !='a' && charArray[i] !='e' && charArray[i] !='i' && charArray[i] !='o' && charArray[i] !='u' &&charArray[i] !='A' && charArray[i] !='E' && charArray[i] !='I' && charArray[i] !='O' &&charArray[i] !='U' ){
                RemovedVowels += charArray[i];
            }
        }

        return RemovedVowels;
    }
}
