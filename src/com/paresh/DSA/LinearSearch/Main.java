package com.paresh.DSA.LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main() {
        int codePoint = 0x1F601;
        String emoji = new String(Character.toChars(codePoint));
        System.out.println("Hello Paresh: "+emoji);
//        int[] arr = {3,4,2,2,67,1,-1,2,45,34,234,23,345,2,8,9};
//        System.out.println("Original Array: "+Arrays.toString(arr));
//        linearSearch(arr, 2, false);// no need to find last index
//        linearSearch(arr, 2, true);// we need to find last index
//        linearSearchMultiple(arr,2);

//        findMinAndMax(arr);

        int[][] twoDArray = {
                {2,5,7,3,90,7,8},
                {1,6,4,2,8,9,3},
                {4,5,10,3,5,7,1},
                {8,76,54,90,34,8,3},
                {6,55,5,8,7,7,8}

        };
//        linearSearchIn2DArray(twoDArray, 90);
//        linearSearchMultipleIn2DArray(twoDArray, 7);
        findMaximumSumSubArray(twoDArray);

    }

    private static void findMaximumSumSubArray(int[][] twoDArray) {
        int maximumSum=Integer.MIN_VALUE;
        for (int i = 0; i <twoDArray.length ; i++) {
            int tempSum = 0;
            for (int j = 0; j <twoDArray[i].length; j++) {
                tempSum += twoDArray[i][j];
            }
            if(tempSum>maximumSum){
                maximumSum = tempSum;
            }
        }
        System.out.println("Maximum Sum Is: "+maximumSum);

    }

    private static void linearSearchMultipleIn2DArray(int[][] twoDArray, int target) {
        int size=0;
        for (int i = 0; i <twoDArray.length; i++) {
            size += twoDArray[i].length;
        }
        int k =0;
        int[][] result=new int[size][2];

        for (int i = 0; i <twoDArray.length ; i++) {
            for (int j = 0; j <twoDArray[i].length; j++) {
                if (twoDArray[i][j] == target) {
                    result[k][0] = i;
                    result[k][1] = j;
                    k++;
                }
            }
        }
        if (k != 0) {
            for (int i = 0; i <k; i++) {
                System.out.println("Element Found at index: ["+ result[i][0] + "] [" + result[i][1] + "]");
            }
        }else{
            System.out.println("Element NOT found.😭");
        }
    }

    private static void linearSearchIn2DArray(int[][] twoDArray, int target) {
        int[] result =new  int[2];
        for (int i = 0; i <twoDArray.length ; i++) {
            boolean found = false;
            for (int j = 0; j <twoDArray[i].length; j++) {
                if (twoDArray[i][j] == target) {
                    result[0] = i;
                    result[1] = j;
                    found = true;
                    break;
                }
            }
            if (found == true) {
                break;
            }
        }
        if (result != null) {
            System.out.println("Element Found at index: "+Arrays.toString(result));
        }else{
            System.out.println("Element NOT found.😭");
        }
    }

    private static void findMinAndMax(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Number in Array is: " + max);
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Maximum Number in Array is: " + min);
    }

    public static void linearSearch(int arr[], int target, boolean lastIndex){
        int result = -1;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == target){
                result = i;
                if(lastIndex != true){
                    break;
                }
            }
        }
        if(result != -1){
            System.out.println("Element found at index: "+ result);
        }else{
            System.out.println("Element NOT found.!");
        }
    }

    private static void linearSearchMultiple(int[] arr, int target) {
        int[] result = new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]){
                result[k] = i;
                k++;
            }
        }
        if(k != -1){
            for (int i = 0; i < k; i++) {
                System.out.println("Element found at index: "+ result[i]);
            }
        }else{
            System.out.println("Element NOT found.!");
        }
    }
}
