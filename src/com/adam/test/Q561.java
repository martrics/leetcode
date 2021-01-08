package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 11:57
 * version: 1.0.0
 */
public class Q561 {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 2, 6, 5, 1, 2};
        Solution solution = new Solution();
        System.out.println(solution.arrayPairSum(nums));
    }

    static class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int total = 0;
            for(int i = 0; i < nums.length; i+=2){
                total += nums[i];
            }
            return total;
        }
    }
}
