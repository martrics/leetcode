package com.adam.test;

public class Q1252 {
    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        int[][] indices = new int[][]{{1, 1}, {0, 0}};

        Solution solution = new Solution();
        System.out.print(solution.oddCells(n, m, indices));
    }

    static class Solution{
        public int oddCells(int n, int m, int[][] indices) {
            int total = 0;
            int[][] matrix = new int[n][m];
            for(int i = 0; i < indices.length; i++){
                int row = indices[i][0];
                int col = indices[i][1];
                for(int j = 0; j < m; j++){
                    matrix[row][j] += 1;
                }
                for(int j = 0; j < n; j++){
                    matrix[j][col] += 1;
                }
            }

            for(int[] row : matrix){
                for(int val : row){
                    if(val % 2 != 0){
                        total++;
                    }
                }
            }
            return total;
        }
    }
}
