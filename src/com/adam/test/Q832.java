package com.adam.test;

public class Q832 {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        Solution solution = new Solution();
        int[][] result = solution.flipAndInvertImage(A);
    }

    static class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            int rows = A.length;
            int cols = A[0].length;
            int[][] result = new int[rows][cols];
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    result[i][j] = 1 - A[i][cols - 1 - j];
                }
            }
            return result;
        }
    }
}
