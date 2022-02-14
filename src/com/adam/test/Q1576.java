package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/2 16:33
 * version: 1.0.0
 */
public class Q1576 {
    public static void main(String[] args) {
        String s = "??";
        Solution solution = new Solution();
        System.out.println(solution.modifyString(s));
    }

    static class Solution{
        public String modifyString(String s) {
            StringBuilder builder = new StringBuilder();
            int n = s.length();
            if(n == 1){
                return "a";
            }
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '?'){
                    if(i == 0){
                        builder.append(s.charAt(i + 1) == 'a'? 'b' : 'a');
                    }else if(i == n - 1){
                        builder.append(builder.charAt(i - 1) == 'a'? 'b' : 'a');
                    }else{
                        if(builder.charAt(i - 1) == 'a'){
                            builder.append(s.charAt(i + 1) == 'b' ? 'c' : 'b');
                        }else if(builder.charAt(i - 1) == 'b'){
                            builder.append(s.charAt(i + 1) == 'a' ? 'c' : 'a');
                        }else{
                            builder.append(s.charAt(i + 1) == 'a'? 'b' : 'a');
                        }
                    }
                }else{
                    builder.append(s.charAt(i));
                }
            }
            return builder.toString();
        }
    }
}
