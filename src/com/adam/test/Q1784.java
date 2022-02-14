package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/13 11:32
 * version: 1.0.0
 */
public class Q1784 {
    public static void main(String[] args) {
        String s = "1001";
        Solution solution = new Solution();
        System.out.println(solution.checkOnesSegment(s));
    }

    static class Solution{
        public boolean checkOnesSegment(String s) {
            return !s.contains("01");
        }
    }
}
