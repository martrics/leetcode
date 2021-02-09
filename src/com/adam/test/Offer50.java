package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/1 15:51
 * version: 1.0.0
 */
public class Offer50 {
    public static void main(String[] args) {
        String s = "abaccdeff";
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar(s));
    }

    static class Solution{
        public char firstUniqChar(String s) {
            int[] freq = new int[26];
            for(int i = 0; i < s.length(); i++){
                freq[s.charAt(i) - 'a']++;
            }
            for(int i = 0; i < s.length(); i++){
                if(freq[s.charAt(i) - 'a'] == 1){
                    return s.charAt(i);
                }
            }
            return ' ';
        }
    }
}
