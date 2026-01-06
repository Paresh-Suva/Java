package com.paresh.DSA.BitManipulation;

public class Main {
    public static void main() {
        printBits(67);
//        printOddEven(54);
//        int result = setIthBit(32,4);
//        printBits(result);
//        int answer = toggleIthBit(32, 4);
//        printBits(answer);
//        int output = unSetIthBit(20, 2);
//        printBits(output);
//        isPowerOfTwo(32);
//        int result = unSetRightMostSetBit(48);
//        printBits(result);
//        noOfSetBits(67);
    }
    public static void printBits(int num){
        for(int i=7; i>=0; i--){
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static void printOddEven(int num){
        if(isBit(num, 0)){
            System.out.println("Number is ODD");
        }else{
            System.out.println("Number is EVEN");
        }
    }

    public static boolean isBit(int num, int bit){
        int result = num & (1 << bit);
        return (result ==0) ? false : true;
    }

    public static int setIthBit(int num, int bit){
        return num | (1<<bit);
    }

    public static int toggleIthBit(int num, int bit){
        return num ^ (1<<bit);
    }

    public static int unSetIthBit(int num, int bit){
        return num & ~(1<<bit);
    }

    public static void isPowerOfTwo(int num){
        if((num & num - 1)==0){
            System.out.println("Number is power of TWO");
        }else{
            System.out.println("Number is NOT power of TWO");
        }
    }
    public static int unSetRightMostSetBit(int num){
        return (num & num - 1);
    }

    public static void noOfSetBits(int num){
        int count =0;
        while (num != 0){
            count++;
            num = unSetRightMostSetBit(num);
        }
        System.out.println(count);
    }
}
