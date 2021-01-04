package com.adam.test;

public class ArrayStringAreEqual {
    public static void main(String[] args){
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};

        Solution solution = new Solution();
        System.out.println(solution.arrayStringsAreEqual(word1, word2));
    }

    static class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();
            for(String str : word1){
                str1.append(str);
            }
            for(String str : word2){
                str2.append(str);
            }
            return str1.toString().equals(str2.toString());
        }
    }
}
