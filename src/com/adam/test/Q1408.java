package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/1 9:50
 * version: 1.0.0
 */
public class Q1408 {
    public static void main(String[] args) {
        String[] words = new String[]{"leetcoder", "leetcode", "od", "hamlet", "am"};
        Solution solution = new Solution();
        List<String> list = solution.stringMatching(words);
        for (String str : list) {
            System.out.print(str + "\t");
        }
    }

    static class Solution {
        public List<String> stringMatching(String[] words) {
            List<String> list = new LinkedList<>();
            Arrays.sort(words, Comparator.comparingInt(String::length));
            int n = words.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (words[j].contains(words[i])) {
                        list.add(words[i]);
                        break;
                    }
                }
            }
            return list;
        }
    }
}
