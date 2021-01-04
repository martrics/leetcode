package com.adam.test;

public class MinTimeToVisitAllPoints {

    public static void main(String[] args){
        int[][] points = new int[][]{{1,1},{3,4},{-1,0}};

        Solution solution = new Solution();
        System.out.println(solution.minTimeToVisitAllPoints(points));
    }

    static class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {
            int x = points[0][0];
            int y = points[0][1];
            int steps = 0;
            for(int[] point : points){
                steps += Math.max(Math.abs(x - point[0]), Math.abs(y - point[1]));
                x = point[0];
                y = point[1];
            }
            return steps;
        }
    }
}
