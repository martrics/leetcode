package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/7 15:44
 * version: 1.0.0
 */
public class Offer29 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int[] spiralOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return new int[0];
            }
            int l = 0;
            int r = matrix[0].length - 1;
            int u = 0;
            int d = matrix.length - 1;
            int[] ans = new int[(r + 1) * (d + 1)];
            int index = 0;
            while (l <= r && u <= d){
                for (int i = l; i <= r; i++) {
                    ans[index++] = matrix[u][i];
                }
                u++;
                for (int i = u; i <= d; i++) {
                    ans[index++] = matrix[i][r];
                }
                r--;
                for (int i = r; i >= l && u <= d; i--) {
                    ans[index++] = matrix[d][i];
                }
                d--;
                for (int i = d; i >= u && l <= r; i--) {
                    ans[index++] = matrix[i][l];
                }
                l++;
            }
            return ans;
        }
    }
}
