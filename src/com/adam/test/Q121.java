package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 15:53
 * version: 1.0.0
 */
public class Q121 {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(prices));
    }

    static class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            if(n < 2){
                return 0;
            }
            int ans = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n;){
                if(i != n - 1 && prices[i] > prices[i + 1]){
                    i++;
                    continue;
                }
                if(prices[i] < min){
                    min = Math.min(min, prices[i]);
                    for(int j = i + 1; j < n; j++){
                        if(prices[j] > prices[i]){
                            ans = Math.max(ans, prices[j] - prices[i]);
                        }
                    }
                }
                i++;
            }
            return ans;
        }
    }
}
