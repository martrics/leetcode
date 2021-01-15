package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 15:31
 * version: 1.0.0
 */
public class Q766 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean isToeplitzMatrix(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < m - 1; j++){
                    if(matrix[i][j] != matrix[i + 1][j + 1]){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
