package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/12 9:26
 * version: 1.0.0
 */
public class Q331 {
    public static void main(String[] args) {
        String preorder =  "9,3,4,#,#,1,#,#,2,#,6,#,#";
        Solution solution = new Solution();
        System.out.println(solution.isValidSerialization(preorder));
    }

    static class Solution {
        public boolean isValidSerialization(String preorder) {
            if(preorder == null || "".equals(preorder)){
                return false;
            }
            if("#".equals(preorder)){
                return true;
            }
            String[] arr = preorder.split(",");
            int n = arr.length;
            if(n < 3){
                return false;
            }
            Stack<String> stack = new Stack<>();
            for(String str : arr){
                if(!"#".equals(str)){
                    stack.push(str);
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }else{
                        if(!"#".equals(stack.peek())){
                            stack.push("#");
                        }else{
                            while(!stack.isEmpty() && "#".equals(stack.peek())){
                                stack.pop();
                                if(stack.isEmpty()){
                                    return false;
                                }
                                if(stack.peek().equals("#")){
                                    return false;
                                }else{
                                    stack.pop();
                                }
                            }
                            stack.push("#");
                        }
                    }
                }
            }
            return stack.size() == 1;
        }
    }
}
