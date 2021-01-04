package com.adam.test;

public class MaxDepth {
    public static void main(String[] args) {
        String s = "1";
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(s));
    }

    static class Solution {
        public int maxDepth(String s) {
            int depth = 0;
            int max = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    depth++;
                    if(depth > max){
                        max = depth;
                    }
                } else if (c == ')'){
                    depth--;
                }
            }
            return max;
        }
    }
}
