package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/21 9:32
 * version: 1.0.0
 */
public class Q806 {
    public static void main(String[] args) {
        int[] widths = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        Solution solution = new Solution();
        int[] result = solution.numberOfLines(widths, s);
        System.out.println(result[0] + "\t" + result[1]);
    }

    static class Solution {
        public int[] numberOfLines(int[] widths, String s) {
            int totalLine = 1;
            int lineCount = 0;
            char[] chars = s.toCharArray();
            for(char c : chars){
                lineCount += widths[c - 'a'];
                if(lineCount > 100){
                    totalLine++;
                    lineCount = widths[c - 'a'];
                }
            }
            return new int[]{totalLine, lineCount};
        }
    }
}
