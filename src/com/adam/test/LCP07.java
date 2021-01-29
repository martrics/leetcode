package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/28 17:35
 * version: 1.0.0
 */
public class LCP07 {
    public static void main(String[] args) {
        int n = 5;
        int[][] relation = new int[][]{{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        int k = 3;
        Solution solution = new Solution();
        System.out.println(solution.numWays(n, relation, k));
    }

    static class Solution {
        public int numWays(int n, int[][] relation, int k) {
            int[][] dp = new int[10][15];
            dp[0][0] = 1;
            for (int i = 0; i < k; i++) {
                for (int[] arr : relation) {
                    dp[i + 1][arr[1]] += dp[i][arr[0]];
                }
            }
            return dp[k][n - 1];
        }
    }
}
