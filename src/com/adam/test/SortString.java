package com.adam.test;

public class SortString {
    public static void main(String[] args) {
        String s = "rat";
        Solution solution = new Solution();
        System.out.println(solution.sortString(s));
    }

    static class Solution{
        public String sortString(String s) {
            StringBuilder builder = new StringBuilder();
            int[] array = new int[26];
            for(char c : s.toCharArray()){
                array[c - 'a']++;
            }
            int length = s.length();
            while(builder.length() < length){
                for(int i = 0; i < 26; i++){
                    if(array[i] > 0){
                        builder.append((char)(i + 'a'));
                        array[i]--;
                    }
                }
                for(int i = 25; i >= 0; i--){
                    if(array[i] > 0){
                        builder.append((char)(i + 'a'));
                        array[i]--;
                    }
                }
            }
            return builder.toString();
        }
    }
}
