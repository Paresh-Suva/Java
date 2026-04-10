/*
PATTERN: Sliding Window
DIFFICULTY: Easy
TIME: O(n)
SPACE: O(1)
*/

package com.paresh.dsaquestions.easy;

public class MaximumSumSubarrayOfSizeK {

    public static int maxSum(int[] nums, int k) {

        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int left = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if(i - left + 1 == k) {
                ans = Math.max(ans, sum);
                sum -= nums[left];
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSum(nums, k));
    }
}