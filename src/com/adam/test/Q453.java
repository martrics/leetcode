package com.adam.test;

import java.util.Arrays;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/13 16:32
 * version: 1.0.0
 */
public class Q453 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int minMoves(int[] nums) {
            int ans = 0;
            int n = nums.length;
            int min = Integer.MAX_VALUE;
            for (int num : nums) {
                min = Math.min(min, num);
            }
            for (int num : nums) {
                ans += num - min;
            }
            return ans;
        }
    }
}
