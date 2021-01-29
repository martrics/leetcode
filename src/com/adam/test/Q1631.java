package com.adam.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 10:17
 * version: 1.0.0
 */
public class Q1631 {
    public static void main(String[] args) {
        int[][] heights = new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        Solution solution = new Solution();
        System.out.println(solution.minimumEffortPath(heights));
    }

    static class Solution {
        public int minimumEffortPath(int[][] heights) {
            int m = heights.length;
            int n = heights[0].length;
            List<int[]> edges = new ArrayList<>();
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    int id = i * n + j;
                    if (i > 0) {
                        edges.add(new int[]{id - n, id, Math.abs(heights[i][j] - heights[i - 1][j])});
                    }
                    if (j > 0) {
                        edges.add(new int[]{id - 1, id, Math.abs(heights[i][j] - heights[i][j - 1])});
                    }
                }
            }
            edges.sort(Comparator.comparingInt(edge -> edge[2]));

            UnionFind uf = new UnionFind(m * n);
            int ans = 0;
            for (int[] edge : edges) {
                int x = edge[0], y = edge[1], v = edge[2];
                uf.union(x, y);
                if (uf.connected(0, m * n - 1)) {
                    ans = v;
                    break;
                }
            }
            return ans;
        }
    }
}
