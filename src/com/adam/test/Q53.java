package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/24 16:10
 * version: 1.0.0
 */
public class Q53 {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }

    static class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int right = 0;
            int ans = Integer.MIN_VALUE;
            int sum = 0;
            while(right < n){
                sum += nums[right];
                ans = Math.max(ans, sum);
                if(sum < 0){
                    sum = 0;
                }
                right++;
            }
            return ans;
        }
    }
}
