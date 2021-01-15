package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 9:34
 * version: 1.0.0
 */
public class Q947 {
    public static void main(String[] args) {
        int[][] stones = new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        Solution solution = new Solution();
        System.out.println(solution.removeStones(stones));
    }

    static class Solution {
        private int[] fa;
        private int[] rank;

        public int removeStones(int[][] stones) {
            int n = stones.length;
            fa = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++){
                fa[i] = i;
                rank[i] = 1;
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                        merge(i, j);
                    }
                }
            }
            int[] group = new int[n];
            for(int i = 0; i < n; i++){
                group[i] = find(i);
            }
            return n - (int)Arrays.stream(group).distinct().count();
        }

        private void merge(int i, int j) {
            int x = find(i);
            int y = find(j);
            if(rank[x] <= rank[y]){
                fa[x] = y;
            }else{
                fa[y] = x;
            }
            if(rank[x] == rank[y] && x != y){
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
