package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/9 10:02
 * version: 1.0.0
 */
public class Offer58I {
    public static void main(String[] args) {
        String s = "  hello world!  ";
        Solution solution = new Solution();
        System.out.println(solution.reverseWords(s));
    }

    static class Solution{
        public String reverseWords(String s) {
            List<String> list = new ArrayList<>();
            int n = s.length();
            for(int i = 0; i < n; i++){
                while(i < n && s.charAt(i) == ' '){
                    i++;
                }
                StringBuilder builder = new StringBuilder();
                while(i < n && s.charAt(i) != ' '){
                    builder.append(s.charAt(i));
                    i++;
                }
                if(builder.length() > 0) {
                    list.add(builder.toString());
                }
            }
            n = list.size();
            if(n == 0){
                return "";
            }
            StringBuilder builder = new StringBuilder();
            builder.append(list.get(n - 1));
            for(int i = n - 2; i >= 0; i--){
                builder.append(" ");
                builder.append(list.get(i));
            }
            return builder.toString();
        }
    }
}
