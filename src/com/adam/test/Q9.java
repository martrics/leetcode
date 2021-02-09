package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/7 14:33
 * version: 1.0.0
 */
public class Q9 {
    public static void main(String[] args) {
        int x = 121;
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(x));
    }

    static class Solution{
        public boolean isPalindrome(int x) {
            StringBuilder builder = new StringBuilder(String.valueOf(x));
            return builder.reverse().toString().equals(String.valueOf(x));
        }
    }
}
