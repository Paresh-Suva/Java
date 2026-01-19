package com.paresh.DSA.Prefix;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 7, 8, 10, 34, 65};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Prefix Sum: " + Arrays.toString(prefixSum(arr)));
    }

    public static int[] prefixSum(int[] array){
        for (int i =1; i<array.length; i++){
            array[i] += array[i-1];
        }
        return array;
    }
}
