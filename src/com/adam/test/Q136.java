package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 10:26
 * version: 1.0.0
 */
public class Q136 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(nums));
    }

    static class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result = result ^ num;
            }
            return result;
        }
    }
}
