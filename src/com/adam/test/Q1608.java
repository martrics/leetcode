package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/25 15:32
 * version: 1.0.0
 */
public class Q1608 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 7, 7, 0};
        Solution solution = new Solution();
        System.out.println(solution.specialArray(nums));
    }

    static class Solution {
        public int specialArray(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= n - i) {
                    if((i >= 1 && nums[i- 1] < n - i) || i == 0) {
                        return n - i;
                    }
                }
            }
            return -1;
        }
    }
}
