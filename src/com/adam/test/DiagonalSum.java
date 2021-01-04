package com.adam.test;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] mat = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        Solution solution = new Solution();
        System.out.println(solution.diagonalSum(mat));
    }

    static class Solution {
        public int diagonalSum(int[][] mat) {
            int result = 0;
            int length = mat.length;
            for(int i = 0; i < length; i++){
                result += mat[i][i];
                result += mat[i][length - 1 - i];
            }
            if(length % 2 != 0){
                result -= mat[length / 2][length / 2];
            }
            return result;
        }
    }
}
