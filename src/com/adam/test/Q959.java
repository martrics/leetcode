package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/25 11:45
 * version: 1.0.0
 */
public class Q959 {
    public static void main(String[] args) {
        String[] grid = new String[]{" /", "/ "};
        Solution solution = new Solution();
        System.out.println(solution.regionsBySlashes(grid));
    }

    static class Solution {
        public int regionsBySlashes(String[] grid) {
            int n = grid.length;
            int size = 4 * n * n;

            UnionFind unionFind = new UnionFind(size);
            for (int i = 0; i < n; i++) {
                char[] row = grid[i].toCharArray();
                for (int j = 0; j < n; j++) {
                    // 二维网格转换为一维表格
                    int index = 4 * (i * n + j);
                    char c = row[j];
                    // 单元格内合并
                    if (c == '/') {
                        // 合并 0、3，合并 1、2
                        unionFind.union(index, index + 3);
                        unionFind.union(index + 1, index + 2);
                    } else if (c == '\\') {
                        // 合并 0、1，合并 2、3
                        unionFind.union(index, index + 1);
                        unionFind.union(index + 2, index + 3);
                    } else {
                        unionFind.union(index, index + 1);
                        unionFind.union(index + 1, index + 2);
                        unionFind.union(index + 2, index + 3);
                    }

                    // 单元格间合并
                    // 向右合并：1（当前）、3（右一列）
                    if (j + 1 < n) {
                        unionFind.union(index + 1, 4 * (i * n + j + 1) + 3);
                    }
                    // 向下合并：2（当前）、0（下一行）
                    if (i + 1 < n) {
                        unionFind.union(index + 2, 4 * ((i + 1) * n + j));
                    }
                }
            }
            return unionFind.getCount();
        }
    }
}
