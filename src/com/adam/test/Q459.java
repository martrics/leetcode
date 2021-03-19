package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/5 17:23
 * version: 1.0.0
 */
public class Q459 {
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        Solution solution = new Solution();
        System.out.println(solution.repeatedSubstringPattern(s));
    }

    static class Solution{
        public boolean repeatedSubstringPattern(String s) {
            String str = s + s;
            return str.substring(1, str.length() - 1).contains(s);
        }
    }
}
