package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 14:29
 * version: 1.0.0
 */
public class Q917 {
    public static void main(String[] args) {
        String s = "7_28]";
        Solution solution = new Solution();
        System.out.println(solution.reverseOnlyLetters(s));
    }

    static class Solution{
        public String reverseOnlyLetters(String S) {
            StringBuilder builder = new StringBuilder();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < S.length(); i++){
                char c = S.charAt(i);
                if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
                    builder.append(c);
                }else{
                    list.add(i);
                }
            }
            builder.reverse();
            for(int val : list){
                builder.insert(val, S.charAt(val));
            }
            return builder.toString();
        }
    }
}
