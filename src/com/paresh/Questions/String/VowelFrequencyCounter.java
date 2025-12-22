//Write a program to find the frequency of each vowels in a string.

package com.paresh.String;

import java.util.Scanner;

public class VowelFrequencyCounter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Your String Here: ");
        String Str = Sc.nextLine();

        FrequencyFinder(Str);
        Sc.close();
    }

    public static void FrequencyFinder(String str){
        char[] Str1 = str.toCharArray();
        int aCount=0,eCount=0,iCount=0,oCount=0,uCount=0;

        for(int i=0;i<str.length();i++){
            if(Str1[i]=='a' || Str1[i]=='A'){
                aCount++;
            }
            if(Str1[i]=='e' || Str1[i]=='E'){
                aCount++;
            }
            else if(Str1[i]=='i' || Str1[i]=='I'){
                aCount++;
            }
            else if(Str1[i]=='o' || Str1[i]=='O'){
                aCount++;
            }
            else if(Str1[i]=='u' || Str1[i]=='U'){
                aCount++;
            }
        }
        System.out.println("Total A: "+aCount);
        System.out.println("Total E: "+eCount);
        System.out.println("Total I: "+iCount);
        System.out.println("Total O: "+oCount);
        System.out.println("Total U: "+uCount);

    }
    
}
