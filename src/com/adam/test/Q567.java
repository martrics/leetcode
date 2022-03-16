package com.adam.test;

import java.util.Arrays;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/10 11:42
 * version: 1.0.0
 */
public class Q567 {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        Solution solution = new Solution();
        System.out.println(solution.checkInclusion(s1, s2));
    }

    static class Solution{
        public boolean checkInclusion(String s1, String s2) {
            int len1 = s1.length();
            int len2 = s2.length();
            if(len2 < len1){
                return false;
            }
            if(len1 == 0){
                return true;
            }
            int[] freq = new int[26];
            for(char c : s1.toCharArray()){
                freq[c - 'a']++;
            }
            int[] freqSub = new int[26];
            for(int i = 0; i < len1; i++){
                freqSub[s2.charAt(i) - 'a']++;
            }
            if(arrayEqual(freq, freqSub)){
                return true;
            }
            for(int i = 1; i <= len2 - len1; i++){
                freqSub[s2.charAt(i - 1) - 'a']--;
                freqSub[s2.charAt(i + len1 - 1) - 'a']++;
                if(arrayEqual(freq, freqSub)){
                    return true;
                }
            }
            return false;
        }

        private boolean arrayEqual(int[] arr1, int[] arr2){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
    }

}
