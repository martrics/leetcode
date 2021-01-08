package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 14:15
 * version: 1.0.0
 */
public class Q1652 {
    public static void main(String[] args) {
        int[] code = new int[]{2, 4, 9, 3};
        int k = -2;
        Solution solution = new Solution();
        int[] result = solution.decrypt(code, k);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] decrypt(int[] code, int k) {
            int n = code.length;
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                int val = 0;
                for (int j = 1; j <= Math.abs(k); j++) {
                    if (k > 0) {
                        val += code[(i + j) % n];
                    } else if (k < 0) {
                        val += code[i - j < 0 ? n + i - j : i - j];
                    }
                    result[i] = val;
                }
            }
            return result;
        }
    }
}
