package com.adam.test;

public class Perimeter {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        Solution solution = new Solution();
        int cir = solution.islandPerimeter(grid);
        System.out.println("Result is: " + cir);
    }

    static class Solution {
        public int islandPerimeter(int[][] grid) {
            int perimeter = 0;
            int x = grid.length;
            int y = grid[0].length;

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if(grid[i][j] == 1) {
                        if (j == 0 || grid[i][j - 1] == 0) {
                            perimeter++;
                        }
                        if ((j == y - 1) || grid[i][j + 1] == 0) {
                            perimeter++;
                        }
                        if (i == 0 || grid[i - 1][j] == 0) {
                            perimeter++;
                        }
                        if ((i == x - 1) || grid[i + 1][j] == 0) {
                            perimeter++;
                        }
                    }
                }
            }

            return perimeter;
        }
    }
}
