package com.adam.test;

public class CountConsistentStrings {
    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = new String[]{"cc","acd","b","ba","bac","bad","ac","d"};
        Solution solution = new Solution();
        System.out.println(solution.countConsistentStrings(allowed, words));
    }

    static class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            int total = 0;
            for(String word : words){
                char[] chars = word.toCharArray();
                boolean flag = true;
                for(char c : chars){
                    if(allowed.indexOf(c) < 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    total++;
                }
            }
            return total;
        }
    }
}
