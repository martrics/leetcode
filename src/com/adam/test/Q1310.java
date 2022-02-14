package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/5/12 10:14
 * version: 1.0.0
 */
public class Q1310 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 8};
        int[][] queries = new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        Solution solution = new Solution();
        int[] ans = solution.xorQueries(arr, queries);
        for(int val : ans){
            System.out.print(val + "\t");
            System.out.println();
        }
    }

    static class Solution {
        public int[] xorQueries(int[] arr, int[][] queries) {
            int n = arr.length;
            int[] xorResult = new int[n];
            xorResult[0] = arr[0];
            for (int i = 1; i < n; i++) {
                xorResult[i] = arr[i] ^ xorResult[i - 1];
            }
            int m = queries.length;
            int[] ans = new int[m];
            for (int i = 0; i < m; i++) {
                int left = queries[i][0];
                int right = queries[i][1];
                if (left == 0) {
                    ans[i] = xorResult[right];
                } else {
                    ans[i] = xorResult[right] ^ xorResult[left - 1];
                }
            }
            return ans;
        }
    }
}
