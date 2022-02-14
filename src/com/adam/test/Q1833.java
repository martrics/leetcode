package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/23 17:05
 * version: 1.0.0
 */
public class Q1833 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int maxIceCream(int[] costs, int coins) {
            int n = costs.length;
            if(n == 0){
                return 0;
            }
            Arrays.sort(costs);
            if(costs[0] > coins){
                return 0;
            }
            int ans = 0;
            for (int cost : costs) {
                if (coins >= cost) {
                    ans ++;
                    coins -= cost;
                } else {
                    break;
                }
            }
            return ans;
        }
    }
}
