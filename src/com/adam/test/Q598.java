package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/3 13:37
 * version: 1.0.0
 */
public class Q598 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int maxCount(int m, int n, int[][] ops) {
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            if(ops.length > 0) {
                for (int[] op : ops) {
                    a = Math.min(a, op[0]);
                    b = Math.min(b, op[1]);
                }
                return a * b;
            }else{
                return m * n;
            }
        }
    }
}
