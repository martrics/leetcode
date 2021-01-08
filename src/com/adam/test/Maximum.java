package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 16:42
 * version: 1.0.0
 */
public class Maximum {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = -2147483647;
        Solution solution = new Solution();
        System.out.println(solution.maximum(a, b));
    }

    static class Solution{
        public int maximum(int a, int b) {
            long c = (long)a - (long)b;
            c = (c >> 63) & 1;
            int[] arr = new int[]{a, b};
            return arr[(int)c];
        }
    }
}
