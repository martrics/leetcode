package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/25 9:18
 * version: 1.0.0
 */
public class Q377 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        Solution solution = new Solution();
        System.out.println(solution.combinationSum4(nums, target));
    }

    static class Solution {
        public int combinationSum4(int[] nums, int target) {
            int[] dp = new int[target + 1];
            dp[0] = 1;

            Arrays.sort(nums);
            for (int i = 1; i < dp.length; i++) {
                for (int val : nums) {
                    if(val <= i) {
                        dp[i] += dp[i - val];
                    }
                }
            }
            return dp[target];
        }
    }
}
