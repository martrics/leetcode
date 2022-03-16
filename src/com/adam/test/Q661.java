package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/13 14:32
 * version: 1.0.0
 */
public class Q661 {
    public static void main(String[] args) {
        int[][] M = new int[][]{{2, 3, 4}, {5, 6, 7}, {8, 9, 10}, {11, 12, 13}, {14, 15, 16}};
        Solution solution = new Solution();
        int[][] ans = solution.imageSmoother(M);
        for (int[] arr : ans) {
            for (int val : arr) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

    }

    static class Solution {
        public int[][] imageSmoother(int[][] M) {
            int m = M.length;
            int n = M[0].length;
            int[][] ans = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int sum = M[i][j];
                    int count = 1;

                    if(i != 0 && j != 0){
                        sum += M[i - 1][j - 1];
                        count++;
                    }
                    if(i != 0){
                        sum += M[i - 1][j];
                        count++;
                    }
                    if(i != 0 && j != n - 1){
                        sum += M[i - 1][j + 1];
                        count++;
                    }
                    if(j != 0){
                        sum += M[i][j - 1];
                        count++;
                    }
                    if(j != n - 1){
                        sum += M[i][j + 1];
                        count++;
                    }
                    if(i != m - 1 && j != 0){
                        sum += M[i + 1][j - 1];
                        count++;
                    }
                    if(i != m - 1){
                        sum += M[i + 1][j];
                        count++;
                    }
                    if(i != m - 1 && j != n - 1){
                        sum += M[i + 1][j + 1];
                        count++;
                    }

                    ans[i][j] = sum / count;
                }
            }
            return ans;
        }
    }
}
