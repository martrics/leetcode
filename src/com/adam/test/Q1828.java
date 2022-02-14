package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/22 18:43
 * version: 1.0.0
 */
public class Q1828 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int[] countPoints(int[][] points, int[][] queries) {
            int n = queries.length;
            int[] ans = new int[n];
            for(int i = 0; i < n; i++){
                int count = 0;
                int x = queries[i][0];
                int y = queries[i][1];
                int r = queries[i][2];
                for(int[] point : points){
                    if((x - point[0]) * (x - point[0]) + (y - point[1]) * (y - point[1]) <= r * r){
                        count++;
                    }
                }
                ans[i] = count;
            }
            return ans;
        }
    }
}
