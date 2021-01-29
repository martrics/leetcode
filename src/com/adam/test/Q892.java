package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 16:08
 * version: 1.0.0
 */
public class Q892 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 0}, {0, 2}};
        Solution solution = new Solution();
        System.out.println(solution.surfaceArea(grid));
    }

    static class Solution {
        public int surfaceArea(int[][] grid) {
            int s = 0;
            int n = grid.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int h = grid[i][j];
                    if(h > 0){
                        s += 2;
                    }
                    s += (h << 2);
                    s -= i > 0 ? (Math.min(h, grid[i - 1][j]) << 1) : 0;
                    s -= j > 0 ? (Math.min(h, grid[i][j - 1]) << 1) : 0;
                }
            }
            return s;
        }
    }
}
