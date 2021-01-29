package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 14:29
 * version: 1.0.0
 */
public class Q812 {
    public static void main(String[] args) {

    }

    static class Solution{
        public double largestTriangleArea(int[][] points) {
            double area = 0;
            int n = points.length;
            for(int i = 0; i < n - 2; i++){
                for(int j = i + 1; j < n - 1; j++){
                    for(int k = i + 2; k < n; k++){
                        area = Math.max(area, Math.abs(points[i][0]*points[j][1] + points[j][0]*points[k][1] + points[k][0]*points[i][1]
                                        -points[i][1]*points[j][0] - points[j][1]*points[k][0] - points[k][1]*points[i][0]));
                    }
                }
            }
            return area / 2;
        }
    }
}
