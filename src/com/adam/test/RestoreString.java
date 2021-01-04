package com.adam.test;

public class RestoreString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        Solution solution = new Solution();
        System.out.println(solution.restoreString(s, indices));
    }

    static class Solution {
        public String restoreString(String s, int[] indices) {
            char[] array = new char[indices.length];
            for(int i = 0; i < s.toCharArray().length; i++){
                array[indices[i]] = s.charAt(i);
            }
            return new String(array);
        }
    }
}
