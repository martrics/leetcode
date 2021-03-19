package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/16 17:24
 * version: 1.0.0
 */
public class Q59 {
    public static void main(String[] args) {
        int n = 5;
        Solution solution = new Solution();
        int[][] ans = solution.generateMatrix(n);
        for(int[] arr : ans){
            for(int val : arr){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    static class Solution {
        public int[][] generateMatrix(int n) {
            int[][] ans = new int[n][n];
            int l = 0;
            int r = n - 1;
            int u = 0;
            int d = n - 1;
            int i = 1;
            while(i <= n * n){
                for(int j = l; j <= r; j++){
                    ans[u][j] = i++;
                }
                u++;
                for(int j = u; j <= d; j++){
                    ans[j][r] = i++;
                }
                r--;
                for(int j = r; j >= l; j--){
                    ans[d][j] = i++;
                }
                d--;
                for(int j = d; j >= u; j--){
                    ans[j][l] = i++;
                }
                l++;
            }
            return ans;
        }
    }
}
