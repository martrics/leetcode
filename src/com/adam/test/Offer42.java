package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/4 11:55
 * version: 1.0.0
 */
public class Offer42 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
    }

    static class Solution {
        public int maxSubArray(int[] nums) {
            int i = 0;
            int max = nums[0];
            int sum = 0;
            int n = nums.length;
            while(i < n && nums[i] < 0){
                max = Math.max(max, nums[i]);
                i++;
            }
            if(i == n){
                return max;
            }
            sum = nums[i++];
            max = sum;
            for(; i < n; i++){
                while(i < n && sum > 0) {
                    sum += nums[i];
                    i++;
                    max = Math.max(sum, max);
                }
                if(i < n) {
                    sum = nums[i];
                    max = Math.max(sum, max);
                }
            }
            return max;
        }
    }
}
