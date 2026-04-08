package com.paresh.Array;

import java.util.Arrays;

public class AddTwoSortedArray {
    static void main(String[] args) {

        int[] firstSortedArray = {1, 2, 5, 8, 11, 13, 15, 18, 20};
        int[] secondSortedArray = {3, 4, 6, 7, 9, 10, 12, 14, 16, 17, 19};

        int firstLength = firstSortedArray.length;
        int secondLength = secondSortedArray.length;
        int finalLength = firstLength + secondLength;

        int[] finalResult = new int[finalLength];

        System.arraycopy(firstSortedArray, 0, finalResult, 0, firstLength);
        System.arraycopy(secondSortedArray, 0, finalResult, 0 + firstLength, secondLength);

        System.out.println(Arrays.toString(finalResult));

        for (int i = 0; i < finalLength; i++) {

            for (int j = i + 1; j < finalLength; j++) {

                if (finalResult[i] > finalResult[j]) {

                    int temp = finalResult[i];
                    finalResult[i] = finalResult[j];
                    finalResult[j] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(finalResult));
    }
}
