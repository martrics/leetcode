package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 17:06
 * version: 1.0.0
 */
public class Q1437 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 0, 1, 0, 1};
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.kLengthApart(nums, k));
    }

    static class Solution {
        public boolean kLengthApart(int[] nums, int k) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                if (nums[i] != 1) {
                    continue;
                }
                for (int j = 1; j <= k; j++) {
                    if (i + j < n && nums[i + j] == 1) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
