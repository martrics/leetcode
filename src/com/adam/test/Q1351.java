package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/28 22:48
 * version: 1.0.0
 */
public class Q1351 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        Solution solution = new Solution();
        System.out.println(solution.countNegatives(grid));
    }

    static class Solution {
        public int countNegatives(int[][] grid) {
            int total = 0;
            for(int i = grid.length - 1; i >= 0; i--){
                int[] arr = grid[i];
                for(int j = arr.length - 1; j >=0; j--){
                    if(arr[j] < 0){
                        total++;
                    }else{
                        continue;
                    }
                }
            }
            return total;
        }
    }
}
