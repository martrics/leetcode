package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/8 19:17
 * version: 1.0.0
 */
public class Q1566 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean containsPattern(int[] arr, int m, int k) {
            int n = arr.length;
            if(n < m * k){
                return false;
            }
            for (int i = 0; i < n; i++) {
                int j = m * k + i, p = i + m;
                if (j > n) {
                    break;
                }
                while (p < j && arr[p - m] == arr[p]) {
                    p++;
                }
                if (p == j) {
                    return true;
                }
            }
            return false;
        }
    }
}
