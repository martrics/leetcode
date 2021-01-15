package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/13 10:03
 * version: 1.0.0
 */
public class Q684 {
    public static void main(String[] args) {
        int[][] edges = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        Solution solution = new Solution();
        int[] edge = solution.findRedundantConnection(edges);
        System.out.println(edge[0] + "->" + edge[1]);
    }

    static class Solution {
        private int[] fa;
        private int[] rank;
        boolean flag = true;

        public int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            fa = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                fa[i] = i;
                rank[i] = 1;
            }
            for (int[] edge : edges) {
                merge(edge[0] - 1, edge[1] - 1);
                if(!flag){
                    return edge;
                }
            }
            return edges[0];
        }

        private void merge(int i, int j) {
            int x = find(i);
            int y = find(j);
            if(x == y){
                flag = false;
            }
            if (rank[x] <= rank[y]) {
                fa[x] = y;
            } else {
                fa[y] = x;
            }
            if (rank[x] == rank[y] && x != y) {
                rank[y]++;
            }
        }

        private int find(int x) {
            if (fa[x] == x) {
                return x;
            } else {
                fa[x] = find(fa[x]);
                return fa[x];
            }
        }
    }
}
