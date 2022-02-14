package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/26 10:20
 * version: 1.0.0
 */
public class Q1011 {
    public static void main(String[] args) {
        int[] weights = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;
        Solution solution = new Solution();
        System.out.println(solution.shipWithinDays(weights, D));
    }

    static class Solution {
        public int shipWithinDays(int[] weights, int D) {
            int n = weights.length;
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, weights[i]);
            }
            int left = max;
            int right = max * n / D + 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                int count = 0;
                int dayCount = 0;
                for (int weight : weights) {
                    if (dayCount + weight > mid) {
                        count++;
                        dayCount = weight;
                    } else {
                        dayCount += weight;
                    }
                }
                if (dayCount != 0) {
                    count++;
                }
                if (count > D) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }

    }
}
