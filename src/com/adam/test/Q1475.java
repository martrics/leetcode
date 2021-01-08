package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/6 16:41
 * version: 1.0.0
 */
public class Q1475 {
    public static void main(String[] args) {
        int[] prices = new int[]{10, 1, 1, 6};
        Solution solution = new Solution();
        int[] result = solution.finalPrices(prices);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public int[] finalPrices(int[] prices) {
            if(prices == null || prices.length == 0){
                return prices;
            }
            int[] discount = new int[prices.length];
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < prices.length; i++){
                while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                    discount[stack.peek()] = prices[i];
                    stack.pop();
                }
                stack.push(i);
            }
            int[] result = new int[prices.length];
            for(int i = 0; i < prices.length; i++){
                result[i] = prices[i] - discount[i];
            }
            return result;
        }
    }
}
