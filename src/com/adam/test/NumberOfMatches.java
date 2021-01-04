package com.adam.test;

public class NumberOfMatches {
    public static void main(String[] args) {
        int n = 7;
        Solution solution = new Solution();
        System.out.println(solution.numberOfMatches(n));
    }

    static class Solution {
        public int numberOfMatches(int n) {
            int total = 0;
            if (n == 2) {
                return 1;
            } else if (n == 1) {
                return 0;
            } else {
                return n / 2 + numberOfMatches(n / 2 + n % 2);
            }
        }
    }
}
