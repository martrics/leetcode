package com.adam.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/5 15:39
 * version: 1.0.0
 */
public class Q748 {
    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String[] words = new String[]{"looks", "pest", "stew", "show"};
        Solution solution = new Solution();
        System.out.println(solution.shortestCompletingWord(licensePlate, words));
    }

    static class Solution{
        public String shortestCompletingWord(String licensePlate, String[] words) {
            Arrays.sort(words, Comparator.comparingInt(String::length));
            licensePlate = licensePlate.replaceAll("[\\d\\s*]", "");
            licensePlate = licensePlate.toLowerCase();
            for(String word : words){
                boolean flag = true;
                int[] alpahbet = new int[26];
                for(char c : word.toCharArray()){
                    alpahbet[c - 'a']++;
                }
                for(char c : licensePlate.toCharArray()){
                    alpahbet[c - 'a']--;
                }
                for(int val : alpahbet){
                    if (val < 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return word;
                }
            }
            return "";
        }
    }
}
