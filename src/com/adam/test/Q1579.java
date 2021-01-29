package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/27 17:25
 * version: 1.0.0
 */
public class Q1579 {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = new int[][]{{3, 1, 2}, {3, 2, 3}, {1, 1, 4}, {2, 1, 4}};
        Solution solution = new Solution();
        System.out.println(solution.maxNumEdgesToRemove(n, edges));
    }

    static class Solution {
        public int maxNumEdgesToRemove(int n, int[][] edges) {
            UnionFind ufa = new UnionFind(n);
            UnionFind ufb = new UnionFind(n);
            int ans = 0;

            for (int[] edge : edges) {
                --edge[1];
                --edge[2];
                if (edge[0] == 3) {
                    if (!ufa.union(edge[1], edge[2])) {
                        ++ans;
                    } else {
                        ufb.union(edge[1], edge[2]);
                    }
                }
            }

            for (int[] edge : edges) {
                if (edge[0] == 1) {
                    if (!ufa.union(edge[1], edge[2])) {
                        ++ans;
                    }
                } else if (edge[0] == 2) {
                    if (!ufb.union(edge[1], edge[2])) {
                        ++ans;
                    }
                }
            }

            if (ufa.getCount() != 1 || ufb.getCount() != 1) {
                return -1;
            }
            return ans;
        }
    }
}
