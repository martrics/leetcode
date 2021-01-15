package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 11:29
 * version: 1.0.0
 */
public class Q1518 {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        Solution solution = new Solution();
        System.out.println(solution.numWaterBottles(numBottles, numExchange));
    }

    static class Solution{
        public int numWaterBottles(int numBottles, int numExchange) {
            int total = numBottles;
            while(numBottles >= numExchange){
                int exchange = numBottles / numExchange;
                total += exchange;
                numBottles = exchange + numBottles % numExchange;
            }
            return total;
        }
    }
}
