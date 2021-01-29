package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/27 18:35
 * version: 1.0.0
 */
public class Q242 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean isAnagram(String s, String t) {
            int[] sArr = new int[26];
            for(char c : s.toCharArray()){
                sArr[c - 'a']++;
            }
            for(char c : t.toCharArray()){
                sArr[c - 'a']--;
            }
            for(int val : sArr){
                if(val != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
