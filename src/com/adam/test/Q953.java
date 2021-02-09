package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 15:36
 * version: 1.0.0
 */
public class Q953 {
    public static void main(String[] args) {
        String[] words = new String[]{"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        Solution solution = new Solution();
        System.out.println(solution.isAlienSorted(words, order));
    }

    static class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            for (int i = 1; i < words.length; i++) {
                if (compare(words[i - 1], words[i], order) > 0) {
                    return false;
                }
            }
            return true;
        }

        private int compare(String o1, String o2, String order) {
            int len1 = o1.length();
            int len2 = o2.length();
            int lim = Math.min(len1, len2);
            char[] v1 = o1.toCharArray();
            char[] v2 = o2.toCharArray();

            int k = 0;
            while (k < lim) {
                char c1 = v1[k];
                char c2 = v2[k];
                if (c1 != c2) {
                    return order.indexOf(c1) - order.indexOf(c2);
                }
                k++;
            }
            return len1 - len2;
        }
    }
}
