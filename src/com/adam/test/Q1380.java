package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 13:39
 * version: 1.0.0
 */
public class Q1380 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        Solution solution = new Solution();
        List<Integer> list = solution.luckyNumbers(matrix);
        for(int val : list){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int m = matrix.length;
            int n = matrix[0].length;
            for(int i = 0; i < m; i++){
                int min = matrix[i][0];
                int k = 0;
                boolean flag = true;
                for(int j = 0; j < n; j++){
                    if(matrix[i][j] < min){
                        min = matrix[i][j];
                        k = j;
                    }
                }
                for(int s = 0; s < m; s++){
                    if(matrix[s][k] > min){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    list.add(min);
                }
            }
            return list;
        }
    }
}
