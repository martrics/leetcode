package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/7 16:27
 * version: 1.0.0
 */
public class Q1037 {
    public static void main(String[] args) {
        int[][] points = new int[][]{{0, 1}, {0, 1}, {2, 1}};
        Solution solution = new Solution();
        System.out.println(solution.isBoomerang(points));
    }

    static class Solution {
        public boolean isBoomerang(int[][] points) {
            return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
        }
    }
}
