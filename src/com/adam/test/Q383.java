package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 15:00
 * version: 1.0.0
 */
public class Q383 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean canConstruct(String ransomNote, String magazine) {
             int[] words = new int[26];
             for(char c : magazine.toCharArray()){
                 words[c - 'a']++;
             }
             for(char c : ransomNote.toCharArray()){
                 words[c - 'a']--;
                 if(words[c - 'a'] < 0){
                     return false;
                 }
             }
             return true;
        }
    }
}
