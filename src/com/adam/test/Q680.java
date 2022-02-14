package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/16 17:29
 * version: 1.0.0
 */
public class Q680 {
    public static void main(String[] args) {
        String s = "abcda";
        Solution solution = new Solution();
        System.out.println(solution.validPalindrome(s));
    }

    static class Solution{
        public boolean validPalindrome(String s) {
            int n = s.length();
            if(n == 0 || n == 1){
                return true;
            }
            int i = 0;
            int j = n - 1;
            while(i < j){
                if(s.charAt(i) != s.charAt(j)){
                    return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
                }
                i++;
                j--;
            }
            return true;
        }

        private boolean isPalindrome(String s, int start, int end){
            while(start < end){
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}
