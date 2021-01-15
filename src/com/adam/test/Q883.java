package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 14:42
 * version: 1.0.0
 */
public class Q883 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        Solution solution = new Solution();
        System.out.println(solution.projectionArea(grid));
    }

    static class Solution {
        public int projectionArea(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int total = 0;

            for (int i = 0; i < n; i++) {
                int maxX = 0;
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] > maxX) {
                        maxX = grid[i][j];
                    }
                    if (grid[i][j] != 0) {
                        total++;
                    }
                }
                total += maxX;
            }

            for (int i = 0; i < m; i++) {
                int maxY = 0;
                for (int j = 0; j < n; j++) {
                    if (grid[j][i] > maxY) {
                        maxY = grid[j][i];
                    }
                }
                total += maxY;
            }

            return total;
        }
    }
}
