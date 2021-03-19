package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/2 13:40
 * version: 1.0.0
 */
public class Q304 {
    public static void main(String[] args) {
        NumMatrix numMatrix = new NumMatrix(new int[0][0]);
        System.out.println(numMatrix.sumRegion(0, 1, 0, 1));
    }

    static class NumMatrix {
        private int[][] matrix;
        public NumMatrix(int[][] matrix) {
            int m = matrix.length;
            if(m > 0) {
                int n = matrix[0].length;
                this.matrix = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        this.matrix[i][j] = matrix[i][j];
                    }
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
                return 0;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            if(row1 > m - 1 || row2 < 0 || col1 > n -1 || col2 < 0){
                return 0;
            }
            int sum = 0;
            for(int i = row1; i <= row2; i++){
                for(int j = col1; j <= col2; j++){
                    sum += matrix[i][j];
                }
            }
            return sum;
        }
    }
}
