package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/11 16:43
 * version: 1.0.0
 */
public class Q292 {
    public static void main(String[] args) {
        int n = 4;
        Solution solution = new Solution();
        System.out.println(solution.canWinNim(n));
    }

    static class Solution{
        public boolean canWinNim(int n) {
            return (n % 4) != 0;
        }
    }
}
