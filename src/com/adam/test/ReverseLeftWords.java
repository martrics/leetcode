package com.adam.test;

public class ReverseLeftWords {
    public static void main(String[] args){
        String s = "lrloseumgh";
        int k = 6;

        Solution solution = new Solution();
        System.out.println(solution.reverseLeftWords(s, k));
    }

    static class Solution {
        public String reverseLeftWords(String s, int n) {
            return s.substring(n) + s.substring(0, n);
        }
    }
}
