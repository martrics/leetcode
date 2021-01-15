package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 16:07
 * version: 1.0.0
 */
public class Q867 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int[][] transpose(int[][] A) {
            int n = A.length;
            int m = A[0].length;
            int[][] result = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    result[i][j] = A[j][i];
                }
            }
            return result;
        }
    }
}
