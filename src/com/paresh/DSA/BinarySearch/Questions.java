package com.paresh.DSA.BinarySearch;

public class Questions {
    public static void main() {
        System.out.println("-------------------------------\n"+" Questions On Binary Search"+new String(Character.toChars(0x2753))+"\n-------------------------------\n");

        int[] arr = {10,30,40,50,60,66,70,78,89,90,100};
//        binarySearch(arr, 78,true);

        int answer = binarySearchFloor(arr, 77);
        System.out.println("Floor: "+answer);

        int result = binarySearchSeil(arr, 77);
        System.out.println("Seil: "+result);

    }

    public static void binarySearch(int[] arr, int target, boolean isFirst){
        int startingIndex = 0;
        int endingIndex = arr.length-1;
        int answer = -1;
        while(startingIndex<=endingIndex){
            int mid = (startingIndex + endingIndex)/2;
            if(arr[mid]==target){
                answer=mid;
                if (isFirst) {
                    endingIndex=mid-1;
                }else {
                    startingIndex=mid+1;
                }
            }
            if (arr[mid] < target) {
                startingIndex = mid+1;
            }else{
                endingIndex = mid-1;
            }
        }
        if(answer != -1){
            System.out.println("Element "+target+" found at index: "+answer);
        }else{
            System.out.println("Element NOT Found.!");
        }
    }

    public static int binarySearchFloor(int[] arr, int target){
        int startingIndex = 0;
        int endingIndex = arr.length-1;
        int answer = -1;
        while(startingIndex <= endingIndex) {
            int mid = startingIndex + (endingIndex - startingIndex) / 2;
            if (arr[mid] == target) {
                answer = arr[mid];
                break;
            } else if (arr[mid] < target) {
                startingIndex = mid + 1;
                answer = arr[mid];
            } else {
                endingIndex = mid - 1;
            }
        }
        return answer;
    }

    public static int binarySearchSeil(int[] arr, int target){
        int startingIndex = 0;
        int endingIndex = arr.length-1;
        int answer = -1;
        while(startingIndex <= endingIndex) {
            int mid = startingIndex + (endingIndex - startingIndex) / 2;
            if (arr[mid] == target) {
                answer = arr[mid];
                break;
            } else if (arr[mid] < target) {
                startingIndex = mid + 1;
            } else {
                endingIndex = mid - 1;
                answer = arr[mid];
            }
        }
        return answer;
    }

}
