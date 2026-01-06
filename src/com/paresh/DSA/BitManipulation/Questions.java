package com.paresh.DSA.BitManipulation;

public class Questions{
    public static void main() {
//        printBits(67);

//        int result = clearLSB(53, 5);
//        System.out.print("LSB: ");
//        printBits(result);
//        int answer = clearMSB(53, 5);
//        System.out.print("MSB: ");
//        printBits(answer);
//        int output = clearMSBExclusive(53, 5);
//        System.out.print("MSBExclusive: ");
//        printBits(output);

//        char output = (char)convertCharToUpperCase('b');
//        System.out.println(output);
//        char result = (char)convertCharToLowerCase('B');
//        System.out.println(result);
//
//        swapTwoNumber(10, 20);

        int[] arr = {1,2,3,4,6,3,2,1};
        printOnlyUniqueNumber(arr);

    }



    public static void printBits(int num){
        for(int i=7; i>=0; i--){
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static int clearLSB(int num, int bit){
        return num & ~((1 << bit+1)-1);
    }

    public static int clearMSB(int num, int bit){
        return num & ((1 << bit)-1);
    }

    public static int clearMSBExclusive(int num, int bit){
        return num & ((1 << bit+1)-1);
    }

    public static int convertCharToUpperCase(int num){
//        return num & ~(1<<5);
        return num & ~'_';
    }

    public static int convertCharToLowerCase(int num){
//        return num  | (1<<5);
        return num | ' ';
    }

    public static void swapTwoNumber(int num1, int num2){
        System.out.println("Num1: " + num1 + " Num2: " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Num1: " + num1 + " Num2: " + num2);
    }

    private static void printOnlyUniqueNumber(int[] arr) {
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        System.out.println(result);
    }
}
