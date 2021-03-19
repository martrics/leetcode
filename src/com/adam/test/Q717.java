package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/16 18:43
 * version: 1.0.0
 */
public class Q717 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean isOneBitCharacter(int[] bits) {
            Stack<Integer> stack = new Stack<>();
            int n = bits.length;
            if(n == 1){
                return true;
            }
            for(int i = 0; i < n - 1; i++){
                if(stack.size() == 0){
                    stack.push(bits[i]);
                }else {
                    if (stack.peek() == 1) {
                        stack.pop();
                        stack.push(0);
                    }else{
                        stack.push(bits[i]);
                    }
                }
            }
            if(stack.size() == 0){
                return false;
            }else {
                return stack.peek() != 1;
            }
        }
    }
}
