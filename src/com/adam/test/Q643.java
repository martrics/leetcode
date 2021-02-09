package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/4 9:20
 * version: 1.0.0
 */
public class Q643 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        Solution solution = new Solution();
        System.out.println(solution.findMaxAverage(nums, k));
    }

    static class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int sum = 0;
            int n = nums.length;
            for(int i = 0; i < k; i++){
                sum += nums[i];
            }
            int max = sum;
            for(int i = 1; i <= n - k; i++){
                sum -= nums[i - 1];
                sum += nums[k - 1 + i];
                if(sum > max){
                    max = sum;
                }
            }
            return max * 1.0 / k;
        }
    }
}
