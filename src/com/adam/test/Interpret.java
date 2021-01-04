package com.adam.test;

public class Interpret {
    public static void main(String[] args){
        String command = "G()()()()(al)";
        Solution solution = new Solution();
        System.out.println(solution.interpret(command));
    }

    static class Solution{
        public String interpret(String command) {
            StringBuilder builder = new StringBuilder();
            char[] chars = command.toCharArray();
            for(int i = 0; i < chars.length; i++){
                if(chars[i] == '('){
                    if(chars[i + 1] == ')') {
                        builder.append("o");
                        i += 1;
                    }else if(chars[i + 1] == 'a'){
                        builder.append("al");
                        i += 3;
                    }
                }else{
                    builder.append(chars[i]);
                }
            }
            return builder.toString();
        }
    }
}
