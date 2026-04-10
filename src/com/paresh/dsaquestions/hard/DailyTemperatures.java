/*
PATTERN: Monotonic Stack
IME: O(n)
SPACE: O(n)
*/
package com.paresh.dsaquestions.hard;

import java.util.*;

public class DailyTemperatures {

    public static int[] nextWarmer(int[] nums) {

        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < nums.length; i++) {

            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] result = nextWarmer(temperatures);

        System.out.println(Arrays.toString(result));
    }
}