package com.paresh.DSA.Maths;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main() {
//        countNumber(0);
//        countNumberViaLog(10);
//        armstrongNumber(153);
//        palindromeNumber(123);
//        printAllDivisors(36);
//        primeNumber(40);
//        sieveAlgorithm(40);
//        newtonRaphsonSqRoot(5);
//        GCD(24, 36);
//        LCM(24, 36);
//        factorial(5);
        findTrailingZerosInFactorial(30);
    }


    public static void countNumber(int num){
        int counter =0;
        if(num==0){
            System.out.println("Total Number Is: 1");
            return;
        }
        while(num>0){
            num/=10;
            counter++;
        }
        System.out.println("Total Number Is: "+counter);
    }

    public static void countNumberViaLog(int num){
        if(num==0){
            System.out.println("Total Number Is: 1");
            return;
        }
//        int counter = (int)((int)Math.log(num)/Math.log(10))+1; = log base 10
        int counter = (int)(Math.log10(num)+1);
        System.out.println("Total Number Is: "+counter);
    }

    public static void armstrongNumber(int num){
        // 153 = (1)^3 + (5)^3 + (3)^3
        int duplicateNum=num;
        int digit;
        int result = 0;
        while(num>0){
            digit=num%10;
            result+=(int)Math.pow(digit,3);
            num/=10;
        }
        System.out.println(duplicateNum==result);
    }

    public static void palindromeNumber(int num){
        int originalNumber = num;
        int reverseNumber=0;
        while(num>0){
            int digit = num%10;
            reverseNumber = reverseNumber*10 + digit;
            num/=10;
        }
        System.out.println(originalNumber==reverseNumber);
    }

    public static List<Integer> printAllDivisors(int num) {
        if (num <= 0) return null;
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i * i != num) {
                    divisors.add(num / i);
                }
            }
        }
        Collections.sort(divisors);
        Integer[] divisorsArray = divisors.toArray(new Integer[0]);
        System.out.println("Divisors of " + num + ": " + Arrays.toString(divisorsArray));
        return divisors;
    }

    public static void primeNumber(int num){
        for (int i=2; i<Math.sqrt(num); i++){
            if (num%i == 0){
                System.out.println(num+" is NOT Prime number.");
                return;
            }
        }
        System.out.println(num+" is prime number");
    }

    public static void sieveAlgorithm(int num){
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        int counter = 2;
        while (counter<=num){
            if (arr[counter]==true){
                for (int factor = counter + counter; factor <= num; factor+=counter) {
                    arr[factor] = false;
                }
            }
            counter++;
        }
        for (int i=2; i<=num; i++){
            System.out.println(i + " : "+ arr[i]);
        }
    }

    public static void newtonRaphsonSqRoot(double num){
        double root;
        double x = num;
        double tol = 0.0001;
        while(true){
            root = 0.5 * (x + (num/x));
            double ans= x - root;
            if(ans<tol){
                break;
            }
            x = root;
        }
        System.out.println("Root of "+num+" is "+ (float)root);
    }

    public static int GCD(int num1, int num2){
//        if (num1 <= 0 || num2 <= 0) return;
//        List<Integer> divisors = printAllDivisors(Math.min(num1, num2));
//        for(int i=divisors.size() - 1; i>=0; i--){
//            int divisor = divisors.get(i);
//            if(num1 % divisor == 0 && num2 % divisor == 0){
//                System.out.println("GCD: "+ divisor);
//                return;
//            }
//        }
        if (num1 <= 0 || num2 <= 0) return 0;
        int a = num1; // 24
        int b = num2; // 36
        int temp;
        while (b != 0) {
            temp = b; // 36 --> 24 --> 12
            b = a % b; // 24 --> 12 --> 0
            a = temp; // 36 --> 24 --> 12 (exit)
        }
//        System.out.println("GCD of "+num1+" and "+ num2 + " : "+ a);
        return a;
    }

    public static void LCM(int num1, int num2){
        int lcm = (num1 * num2)/GCD(num1, num2);
        System.out.println("LCM is: "+lcm);
    }

    public static void factorial(int num){
        int result=1;
        while (num>1){
            result*=num;
            num--;
        }
        System.out.println(result);
    }

    public static void findTrailingZerosInFactorial(int num) {
        double result = 0;
        for (int i = 5; i <= num; i *= i) {
            result += Math.floor(num / i);
        }
        System.out.println(result);
    }
 }
