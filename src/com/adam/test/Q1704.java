package com.adam.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/7 17:45
 * version: 1.0.0
 */
public class Q1704 {
    public static void main(String[] args) {
        String s = "ao";
        Solution solution = new Solution();
        System.out.println(solution.halvesAreAlike(s));
    }

    static class Solution {
        public boolean halvesAreAlike(String s) {
            List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
            Set<Character> set = new HashSet<>(list);
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                if(set.contains(s.charAt(i))){
                    count1++;
                }
                if(set.contains(s.charAt(i + s.length()/2))){
                    count2++;
                }
            }
            return count1 == count2;
        }
    }
}
