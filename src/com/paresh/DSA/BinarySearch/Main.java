package com.paresh.DSA.BinarySearch;

public class Main {
    public static void main() {
        System.out.println("Hello Paresh: "+new String(Character.toChars(0x1F601))+"\n-----------------------------------");
        int[] arr = {10,30,40,50,60,66,70,78,89,90,100};
//        binarySearchIncreasing(arr,78);

        int[] arr2 = {100,90,89,86,76,54,32,21,11,2};
//        binarySearchDecreasing(arr2,76);

        binarySearchOrderAgnostic(arr, 78);
        binarySearchOrderAgnostic(arr2, 76);
    }

    public static void binarySearchOrderAgnostic(int[] arr, int target){
        int startingIndex = 0;
        int endingIndex = arr.length-1;
        if (arr[startingIndex] <= arr[endingIndex]) {
            binarySearchIncreasing(arr,target);
        }else{
            binarySearchDecreasing(arr,target);
        }
    }

    public static void binarySearchIncreasing(int[] arr, int target){
        int startingIndex = 0;
        int endingIndex = arr.length-1;
        int answer = -1;
        while(startingIndex<=endingIndex){
            int mid = (startingIndex + endingIndex)/2;
            if(arr[mid]==target){
                answer=mid;
                break;
            }
            if (arr[mid] > target) {
                endingIndex = mid-1;
            }else{
                startingIndex = mid+1;
            }
        }
        if(answer != -1){
            System.out.println("Element "+target+" found at index: "+answer);
        }else{
            System.out.println("Element NOT Found.!");
        }
    }

    public static void binarySearchDecreasing(int[] arr, int target){
        int startingIndex = 0;
        int endingIndex = arr.length-1;
        int answer = -1;
        while(startingIndex<=endingIndex){
            int mid = (startingIndex + endingIndex)/2;
            if(arr[mid]==target){
                answer=mid;
                break;
            }
            if (arr[mid] < target) {
                endingIndex = mid-1;
            }else{
                startingIndex = mid+1;
            }
        }
        if(answer != -1){
            System.out.println("Element "+target+" found at index: "+answer);
        }else{
            System.out.println("Element NOT Found.!");
        }
    }
}
