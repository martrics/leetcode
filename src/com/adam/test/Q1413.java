package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 16:55
 * version: 1.0.0
 */
public class Q1413 {
    public static void main(String[] args) {
        int[] nums = new int[]{-3, 2, -3, 4, 2};
        Solution solution = new Solution();
        System.out.println(solution.minStartValue(nums));
    }

    static class Solution {
        public int minStartValue(int[] nums) {
            int min = 0;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum < min) {
                    min = sum;
                }
            }
            return min >= 0 ? 1 : 1 - min;
        }
    }
}
