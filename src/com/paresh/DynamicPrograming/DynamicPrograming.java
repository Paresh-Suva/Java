package com.paresh.DynamicPrograming;

import java.util.Arrays;

public class DynamicPrograming {
    public static void main(String[] args) {

        int target = 18;
        int[] coins = {7, 5, 1};

        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int answer = minCoins(target, coins, dp);
        System.out.println("Answer: "+ answer);
    }
    static int minCoins(int target, int[] coins, int[] dp){

        if(target == 0){
            return 0;
        }

        int answer = Integer.MAX_VALUE;

        for(int i=0; i < coins.length ;i++){

            if ((target - coins[i]) >= 0) {
                int subAns = 0;
                if( dp[target - coins[i]] != -1){
                    subAns = dp[target - coins[i]];
                }else{
                    subAns = minCoins(target-coins[i], coins, dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < answer){
                    answer = subAns + 1;
                }
            }
        }
        return dp[target] = answer;
    }
}
