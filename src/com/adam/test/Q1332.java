package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 17:26
 * version: 1.0.0
 */
public class Q1332 {
    public static void main(String[] args) {
        String s = "ababa";
        Solution solution = new Solution();
        System.out.println(solution.removePalindromeSub(s));
    }

    static class Solution{
        public int removePalindromeSub(String s) {
            if(s.length() == 0){
                return 0;
            }
            StringBuilder builder = new StringBuilder(s);
            if(builder.reverse().toString().equals(s)){
                return 1;
            }
            return 2;
        }
    }
}
