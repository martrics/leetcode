package com.adam.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/26 9:53
 * version: 1.0.0
 */
public class Q1178 {
    public static void main(String[] args) {
        String[] words = new String[]{"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = new String[]{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        Solution solution = new Solution();
        List<Integer> list = solution.findNumOfValidWords(words, puzzles);
        for (int val : list) {
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
            List<Integer> list = new ArrayList<>();
            if (words.length == 0 || puzzles.length == 0) {
                return list;
            }

            Map<Integer, Integer> map = new HashMap<>();
            for (String s : words) {
                int wordBit = 0;
                for (char c : s.toCharArray()) {
                    wordBit |= (1 << (c - 'a'));
                }
                if (Integer.bitCount(wordBit) <= 7) {
                    map.put(wordBit, map.getOrDefault(wordBit, 0) + 1);
                }
            }

            for (String puzzle : puzzles) {
                int puzzuleBit = 0;
                for (int i = 1; i < 7; i++) {
                    puzzuleBit |= (1 << (puzzle.charAt(i) - 'a'));
                }
                int count = 0;
                for (int j = puzzuleBit; j >= 0; ) {
                    count += map.getOrDefault(j | (1 << (puzzle.charAt(0) - 'a')), 0);
                    if (j == 0) {
                        break;
                    } else {
                        j = (j - 1) & puzzuleBit;
                    }
                }
                list.add(count);
            }
            return list;
        }
    }
}
