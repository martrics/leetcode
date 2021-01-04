package com.adam.test;

import java.util.Arrays;

public class Q1464 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 2};
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums));
    }

    static class Solution {
        public int maxProduct(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            return (nums[n-1] - 1) * (nums[n - 2] - 1);
        }
    }
}
