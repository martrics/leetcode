package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/13 11:34
 * version: 1.0.0
 */
public class Q1047 {
    public static void main(String[] args) {
        String S = "abbaca";
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(S));
    }

    static class Solution{
        public String removeDuplicates(String S) {
            if(S == null || S.length() == 1){
                return S;
            }
            Stack<Character> stack = new Stack<>();
            for(char c : S.toCharArray()){
                if(!stack.isEmpty() && c == stack.peek()){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
            StringBuilder s = new StringBuilder();
            while(!stack.isEmpty()){
                s.append(stack.pop());
            }
            return s.reverse().toString();
        }
    }
}
