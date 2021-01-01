package com.adam.test;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/28 22:07
 */
public class Q804 {
    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        Solution solution = new Solution();
        System.out.println(solution.uniqueMorseRepresentations(words));
    }

    static class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] morses = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            Set<String> set = new HashSet<>();
            for(String word : words){
                StringBuilder builder = new StringBuilder();
                for(char c : word.toCharArray()){
                    builder.append(morses[c - 'a']);
                }
                set.add(builder.toString());
            }
            return set.size();
        }
    }
}
