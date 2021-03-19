package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/4 19:02
 * version: 1.0.0
 */
public class Q70 {
    public static void main(String[] args) {
        int n = 3;
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(n));
    }

    static class Solution {
        public int climbStairs(int n) {
            if (n <= 2) {
                return n;
            }
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n - 1];
        }
    }
}
