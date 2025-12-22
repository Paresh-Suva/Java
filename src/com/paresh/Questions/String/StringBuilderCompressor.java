package com.paresh.String;

import java.util.Scanner;

public class StringBuilderCompressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NOTE: Case Sensitive And Space Are Not Allowed...");
        System.out.print("Enter Your First String Here: ");
        String original = sc.nextLine();
        sc.close();

        StringBuilder answer = new StringBuilder();
        int count = 1;
        for(int i = 0; i < original.length(); i++){
            if(i+1 < original.length() && original.charAt(i) == original.charAt(i+1)){
                count++;
            }
            else{
                answer.append(original.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(answer);
    }
}
