package com.adam.test;

import java.nio.charset.StandardCharsets;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 16:48
 * version: 1.0.0
 */
public class Q1160 {
    public static void main(String[] args) {
        String[] words = new String[]{"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        Solution solution = new Solution();
        System.out.println(solution.countCharacters(words, chars));
    }

    static class Solution{
        public int countCharacters(String[] words, String chars) {
            int[] charArr = new int[26];
            for(char c : chars.toCharArray()){
                charArr[c - 'a']++;
            }
            int result = 0;
            for(String word : words){
                int[] arr = new int[26];
                for(char c : word.toCharArray()){
                    arr[c - 'a']++;
                }
                boolean flag = true;
                for(int i = 0; i < 26; i++){
                    if(arr[i] > charArr[i]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    result += word.length();
                }
            }
            return result;
        }
    }
}
