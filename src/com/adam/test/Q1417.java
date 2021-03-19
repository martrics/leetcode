package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/5 14:52
 * version: 1.0.0
 */
public class Q1417 {
    public static void main(String[] args) {
        String s = "a0b1c2";
        Solution solution = new Solution();
        System.out.println(solution.reformat(s));
    }

    static class Solution {
        public String reformat(String s) {
            List<Character> numList = new ArrayList<>();
            List<Character> letterList = new ArrayList<>();
            for(char c : s.toCharArray()){
                if(c >= '0' && c <='9'){
                    numList.add(c);
                }else{
                    letterList.add(c);
                }
            }
            if(Math.abs(numList.size() - letterList.size()) > 1){
                return "";
            }
            StringBuilder builder = new StringBuilder();
            if(numList.size() > letterList.size()){
                builder.append(numList.get(numList.size() - 1));
                for(int i = 0; i < letterList.size(); i++){
                    builder.append(letterList.get(i));
                    builder.append(numList.get(i));
                }
            }else if(numList.size() < letterList.size()){
                builder.append(letterList.get(letterList.size() - 1));
                for(int i = 0; i < numList.size(); i++){
                    builder.append(numList.get(i));
                    builder.append(letterList.get(i));
                }
            }else{
                for(int i = 0; i < numList.size(); i++){
                    builder.append(numList.get(i));
                    builder.append(letterList.get(i));
                }
            }
            return builder.toString();
        }
    }
}
