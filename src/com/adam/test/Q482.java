package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/11 22:08
 * version: 1.0.0
 */
public class Q482 {
    public static void main(String[] args) {
        String s = "--a-a-a-a--";
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.licenseKeyFormatting(s, k));
    }

    static class Solution {
        public String licenseKeyFormatting(String s, int k) {
            int n = s.length();
            StringBuilder builder = new StringBuilder();
            for (int i = n - 1; i >= 0; ) {
                for (int j = 0; j < k && i >= 0; ) {
                    char c = s.charAt(i);
                    if (c != '-') {
                        if (c >= 'a' && c <= 'z') {
                            c = (char) (c - 'a' + 'A');
                        }
                        builder.append(c);
                        j++;
                    }
                    i--;
                }
                builder.append("-");
            }
            int i = builder.length() - 1;
            while (i >= 0 && builder.charAt(i) == '-') {
                builder.deleteCharAt(i);
                i--;
            }
            return builder.reverse().toString();
        }
    }
}
