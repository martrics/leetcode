package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/26 11:21
 * version: 1.0.0
 */
public class Q807 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}};
        Solution solution = new Solution();
        System.out.println(solution.maxIncreaseKeepingSkyline(grid));
    }

    static class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[] horizon = new int[m];
            int[] vertical = new int[n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    horizon[i] = Math.max(horizon[i], grid[i][j]);
                    vertical[j] = Math.max(vertical[j], grid[i][j]);
                }
            }

            int ans = 0;
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    int height = Math.min(horizon[i], vertical[j]);
                    if(grid[i][j] < height){
                        ans += height - grid[i][j];
                    }
                }
            }
            return ans;
        }
    }
}
