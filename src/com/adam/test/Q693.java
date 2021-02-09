package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/1 10:58
 * version: 1.0.0
 */
public class Q693 {
    public static void main(String[] args) {
        int n = 5;
        Solution solution = new Solution();
        System.out.println(solution.hasAlternatingBits(n));
    }

    static class Solution{
        public boolean hasAlternatingBits(int n) {
            n = n ^ (n >> 1);
            return (n & (n + 1)) == 0;
        }
    }
}
