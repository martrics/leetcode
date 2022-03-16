package com.adam.test;

import java.util.*;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/30 17:51
 * version: 1.0.0
 */
public class Q778 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}};
        Solution solution = new Solution();
        System.out.println(solution.swimInWater(grid));
    }

    static class Solution {
        public int swimInWater(int[][] grid) {
            int n = grid.length;
            UnionFind unionFind = new UnionFind(n * n);
            boolean[][] visited = new boolean[n][n];
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    set.add(grid[i][j]);
                }
            }
            for (int val : set) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (!visited[i][j] && grid[i][j] <= val) {
                            if (j != 0 && grid[i][j - 1] <= val) {
                                unionFind.union(i * n + (j - 1), i * n + j);
                            }
                            if (j != n - 1 && grid[i][j + 1] <= val) {
                                unionFind.union(i * n + j + 1, i * n + j);
                            }
                            if (i != n - 1 && grid[i + 1][j] <= val) {
                                unionFind.union((i + 1) * n + j, i * n + j);
                            }
                            if (i != 0 && grid[i - 1][j] <= val) {
                                unionFind.union((i - 1) * n + j, i * n + j);
                            }
                            visited[i][j] = true;
                        }
                    }
                }
                if(unionFind.connected(0, n * n - 1)){
                    return val;
                }
            }
            return -1;
        }
    }
}
