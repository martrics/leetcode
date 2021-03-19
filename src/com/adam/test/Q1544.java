package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/3 16:46
 * version: 1.0.0
 */
public class Q1544 {
    public static void main(String[] args) {

    }

    static class Solution{
        public String makeGood(String s) {
            Stack<Character> stack = new Stack<>();
            for(char c : s.toCharArray()){
                if(stack.isEmpty()){
                    stack.push(c);
                }else {
                    if (Math.abs(c - stack.peek()) == 32) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            StringBuilder builder = new StringBuilder();
            while(!stack.isEmpty()){
                char c = stack.pop();
                builder.append(c);
            }
            return builder.reverse().toString();
        }
    }
}
