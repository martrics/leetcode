package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/18 18:01
 * version: 1.0.0
 */
public class Q28 {
    public static void main(String[] args) {
        String haystack = "abcde";
        String needle = "cde";
        Solution solution = new Solution();
        System.out.println(solution.strStr(haystack, needle));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            int n = haystack.length();
            int m = needle.length();
            if (m == 0) {
                return 0;
            }
            if (n < m) {
                return -1;
            }
            for (int i = 0; i < n - m + 1; i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    boolean flag = false;
                    for (int j = 1; j < m; j++) {
                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}
