package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/8 19:04
 * version: 1.0.0
 */
public class Q20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }

    static class Solution{
        public boolean isValid(String s) {
            int n = s.length();
            if(n % 2 != 0){
                return false;
            }
            Stack<Character> stack = new Stack<>();
            for(char c : s.toCharArray()){
                if(stack.isEmpty()){
                    stack.push(c);
                }else{
                    char pre = stack.peek();
                    if(pre == '(' && c == ')' || pre == '[' && c == ']' || pre == '{' && c == '}'){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
