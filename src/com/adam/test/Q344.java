package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 10:38
 * version: 1.0.0
 */
public class Q344 {
    public static void main(String[] args) {
        char[] s = "hell".toCharArray();
        Solution solution = new Solution();
        solution.reverseString(s);
        System.out.println(String.valueOf(s));
    }

    static class Solution {
        public void reverseString(char[] s) {
            int n = s.length;
            for(int i = 0; i < n / 2; i++){
                char tmp = s[i];
                s[i] = s[n - 1 - i];
                s[n - 1 - i] = tmp;
            }
        }
    }
}
