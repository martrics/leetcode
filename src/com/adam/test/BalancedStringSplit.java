package com.adam.test;

public class BalancedStringSplit {
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        Solution solution = new Solution();
        System.out.println(solution.balancedStringSplit(s));
    }

    static class Solution {
        public int balancedStringSplit(String s) {
            int total = 0;
            int rCount = 0;
            int lCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    rCount++;
                } else if (s.charAt(i) == 'L') {
                    lCount++;
                }
                if (rCount == lCount) {
                    total++;
                }
            }
            return total;
        }
    }
}
