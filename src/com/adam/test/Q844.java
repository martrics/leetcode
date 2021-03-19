package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/1 11:59
 * version: 1.0.0
 */
public class Q844 {
    public static void main(String[] args) {
        String S = "ab##";
        String T = "c#d#";
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare(S, T));
    }

    static class Solution {
        public boolean backspaceCompare(String S, String T) {
            return convert(S).equals(convert(T));
        }

        private String convert(String s){
            StringBuilder builder = new StringBuilder();
            int len = 0;
            for(char c : s.toCharArray()){
                if(c == '#'){
                    if(len > 0) {
                        builder.deleteCharAt(len - 1);
                        len--;
                    }
                }else{
                    builder.append(c);
                    len++;
                }
            }
            return builder.toString();
        }
    }
}
