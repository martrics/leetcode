package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/20 15:13
 * version: 1.0.0
 */
public class Q122 {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }

    static class Solution {
        public int maxProfit(int[] prices) {
            int total = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    total += prices[i] - prices[i - 1];
                }
            }
            return total;
        }
    }
}
