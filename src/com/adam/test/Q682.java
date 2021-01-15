package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 13:38
 * version: 1.0.0
 */
public class Q682 {
    public static void main(String[] args) {
        String[] ops = new String[]{"5","-2","4","C","D","9","+","+"};
        Solution solution = new Solution();
        System.out.println(solution.calPoints(ops));
    }

    static class Solution{
        public int calPoints(String[] ops) {
            Stack<Integer> stack = new Stack<>();
            for(String str : ops){
                if("+".equals(str)){
                    int peek = stack.peek();
                    stack.pop();
                    int val = peek + stack.peek();
                    stack.push(peek);
                    stack.push(val);
                }else if("D".equals(str)){
                    int val = 2 * stack.peek();
                    stack.push(val);
                }else if("C".equals(str)){
                    stack.pop();
                }else{
                    stack.push(Integer.valueOf(str));
                }
            }
            int result = 0;
            while(!stack.isEmpty()){
                result += stack.pop();
            }
            return result;
        }
    }
}
