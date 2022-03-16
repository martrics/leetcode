package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/18 22:35
 * version: 1.0.0
 */
public class Q168 {
    public static void main(String[] args) {
        int columnNumber = 26;
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(columnNumber));
    }

    static class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder builder = new StringBuilder();
            while(columnNumber > 0){
                builder.append(columnNumber % 26 + 'A');
                columnNumber = columnNumber / 26;
            }
            return builder.reverse().toString();
        }
    }
}
