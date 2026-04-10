/*
PATTERN: Prefix Sum + HashMap
DIFFICULTY: Medium
TIME: O(n)
SPACE: O(n)
*/

package com.paresh.dsaquestions.medium;

import java.util.*;

public class LongestSubarrayWithSumK {

    public static int longestSubarray(int[] nums, int k) {
        // {1, -1, 5, -2, 3};
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i]; // 1, 0, 5, 3, 6

            if(sum == k) { // YES
                ans = i + 1; // 3 + 1 --> 4
            }

            if(map.containsKey(sum - k)) { // 1 - 3 = 2 NO. --> 0 - 3 = 3 NO. --> 5 - 3 = 2 NO. --> 3 - 3 = 0 NO. --> 6 - 3 = 3 YES.
                int length = i - map.get(sum - k); // 4 - 3 = 1
                ans = Math.max(ans, length); // 4, 1 --> 4
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i); // 1, 0 --> 0, 1 --> 5, 2 --> 3, 4
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;

        System.out.println(longestSubarray(nums, k));
    }
}