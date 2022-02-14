package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/28 16:55
 * version: 1.0.0
 */
public class Q861 {
    public static void main(String[] args) {
        int[][] A = new int[][]{{0}};
        Solution solution = new Solution();
        System.out.println(solution.matrixScore(A));
    }

    static class Solution {
        public int matrixScore(int[][] A) {
            int m = A.length;
            int n = A[0].length;
            for (int i = 0; i < m; i++) {
                if (A[i][0] == 0) {
                    for (int j = 0; j < n; j++) {
                        A[i][j] = 1 - A[i][j];
                    }
                }
            }
            for (int j = 1; j < n; j++) {
                int oneCount = 0;
                for (int i = 0; i < m; i++) {
                    oneCount += A[i][j];
                }
                if (oneCount <= m / 2) {
                    for (int i = 0; i < m; i++) {
                        A[i][j] = 1 - A[i][j];
                    }
                }
            }
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int i = 0; i < m; i++) {
                    colSum += A[i][j];
                }
                sum += colSum * (1 << (n - 1 - j));
            }
            return sum;
        }
    }
}
