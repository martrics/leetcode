package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/15 18:44
 * version: 1.0.0
 */
public class Q213 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 2};
        Solution solution = new Solution();
        System.out.println(solution.rob(nums));
    }

    static class Solution{
        public int rob(int[] nums) {
            int n = nums.length;
            if(n == 0){
                return 0;
            }
            if(n == 1){
                return nums[0];
            }
            return Math.max(robInternal(nums, 0, n - 2), robInternal(nums, 1, n - 1));
        }

        private int robInternal(int[] nums, int start, int end){
            if(start == end){
                return nums[start];
            }
            int n = end - start + 1;
            int[] dp = new int[n];
            dp[0] = nums[start];
            dp[1] = Math.max(nums[start], nums[start + 1]);
            for(int i = 2; i < n; i++){
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[start + i]);
            }
            return dp[n - 1];
        }
    }
}
