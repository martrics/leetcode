package com.adam.test;

public class MinCount {
    public static void main(String[] args){
        int[] coins = new int[]{2, 3, 10};
        Solution solution = new Solution();
        System.out.println(solution.minCount(coins));
    }

    static class Solution {
        public int minCount(int[] coins) {
            int result = 0;
            for(int val : coins){
                result += (val >> 1) + (val & 0b1);
            }
            return result;
        }
    }
}
