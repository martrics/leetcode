package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/30 9:40
 * version: 1.0.0
 */
public class Q1046 {
    public static void main(String[] args) {
        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        Solution solution = new Solution();
        System.out.println(solution.lastStoneWeight(stones));
    }

    static class Solution {
        public int lastStoneWeight(int[] stones) {
            int n = stones.length;
            Arrays.sort(stones);
            for(int i = 1; i < n; i++){
                stones[n - 1] = stones[n - 1] - stones[n - 2];
                stones[n - 2] = 0;
                Arrays.sort(stones);
            }
            return stones[n - 1];
        }
    }
}
