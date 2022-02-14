package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/2 16:52
 * version: 1.0.0
 */
public class Q125 {
    public static void main(String[] args) {
        String s = "race a car";
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(s));
    }

    static class Solution{
        public boolean isPalindrome(String s) {
            StringBuilder builder = new StringBuilder();
            s = s.toLowerCase();
            for(char c : s.toCharArray()){
                if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
                    builder.append(c);
                }
            }
            return builder.toString().equals(builder.reverse().toString());
        }
    }
}
