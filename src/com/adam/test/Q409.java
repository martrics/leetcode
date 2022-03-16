package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/12 23:28
 * version: 1.0.0
 */
public class Q409 {
    public static void main(String[] args) {
        String s = "abccccdd";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(s));
    }

    static class Solution{
        public int longestPalindrome(String s) {
            if(s.length() < 2){
                return s.length();
            }
            int[] upper = new int[26];
            int[] lower = new int[26];
            for(char c : s.toCharArray()){
                if(c >= 'a' && c <= 'z'){
                    lower[c - 'a']++;
                }else{
                    upper[c - 'A']++;
                }
            }
            int count = 0;
            boolean single = false;
            for(int i = 0; i < 26; i++){
                if((upper[i] & 0x1) == 0){
                    count += upper[i];
                }else {
                    single = true;
                    count += upper[i] - 1;
                }
                if((lower[i] & 0x1) == 0){
                    count += lower[i];
                }else{
                    single = true;
                    count += lower[i] - 1;
                }
            }
            return count + (single? 1 : 0);
        }
    }

}
