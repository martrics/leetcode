package com.adam.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/19 9:22
 * version: 1.0.0
 */
public class Q1584 {
    public static void main(String[] args) {
        int[][] points = new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        Solution solution = new Solution();
        System.out.println(solution.minCostConnectPoints(points));
    }

    static class Solution {
        public int minCostConnectPoints(int[][] points) {
            int totalCost = 0;
            if(points.length == 1){
                return totalCost;
            }

            int n = points.length;
            boolean[] visited = new boolean[n];
            int[] cost = new int[n];
            visited[0] = true;
            int[][] dist = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    dist[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                }
            }

            for(int i = 0; i < n; i++){
                cost[i] = dist[0][i];
            }

            for(int i = 1; i < n; i++){
                int minCost = Integer.MAX_VALUE;
                int addPoint = 0;
                for(int j = 1; j < n; j++){
                    if(!visited[j] && cost[j] < minCost){
                        minCost = cost[j];
                        addPoint = j;
                    }
                }
                visited[addPoint] = true;
                totalCost += minCost;

                for(int j = 1; j < n; j++){
                    if(dist[addPoint][j] < cost[j] && !visited[j]){
                        cost[j] = dist[addPoint][j];
                    }
                }

            }

            return totalCost;
        }
    }
}
