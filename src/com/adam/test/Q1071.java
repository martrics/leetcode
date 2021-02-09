package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 13:48
 * version: 1.0.0
 */
public class Q1071 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABCABC";
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings(str1, str2));
    }

    static class Solution {
        public String gcdOfStrings(String str1, String str2) {
            int len1 = str1.length();
            int len2 = str2.length();
            int len = gcd(len1, len2);
            String str = str1.substring(0, len);
            for (int i = 0; i <= len1 - len; i += len) {
                if (!str1.substring(i, i + len).equals(str)) {
                    return "";
                }
            }
            for (int i = 0; i <= len2 - len; i += len) {
                if (!str2.substring(i, i + len).equals(str)) {
                    return "";
                }
            }
            return str;
        }

        private int gcd(int a, int b) {
            return b == 0? a : gcd(b, a % b);
        }
    }
}
