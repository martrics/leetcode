package com.adam.test;

public class Q1021 {
    public static void main(String[] args) {
        String s = "()()";
        Solution solution = new Solution();
        System.out.println(solution.removeOuterParentheses(s));
    }

    static class Solution{
        public String removeOuterParentheses(String s) {
            int k = 0;
            boolean valid = false;
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    k++;
                }else if(s.charAt(i) == ')'){
                    k--;
                }
                if(!valid && k > 1){
                    valid = true;
                }
                if(valid && k == 0 ){
                    valid = false;
                }
                if(valid){
                    builder.append(s.charAt(i));
                }
            }
            return builder.toString();
        }
    }
}
