package com.paresh.dsaquestions.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // left product
        result[0] = 1;
        for(int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // right product
        int right = 1;
        for(int i = n - 1; i >= 0; i--) {

            result[i] = result[i] * right;

            right = right * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2,2,4,4};

        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}