package com.adam.test;

public class Calculate {
    public static void main(String[] args) {
        String s = "AB";
        Solution solution = new Solution();
        System.out.println(solution.calculate(s));
    }

    static class Solution {
        public int calculate(String s) {
            int x = 1;
            int y = 0;
            for (char c : s.toCharArray()) {
                if (c == 'A') {
                    x = 2 * x + y;
                } else {
                    y = 2 * y + x;
                }
            }
            return x + y;
        }
    }
}
