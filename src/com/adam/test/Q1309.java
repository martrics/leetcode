package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/29 15:20
 * version: 1.0.0
 */
public class Q1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        Solution solution = new Solution();
        System.out.println(solution.freqAlphabets(s));
    }

    static class Solution{
        public String freqAlphabets(String s) {
            char[] array = s.toCharArray();
            List<Character> list = new ArrayList<>();
            for(int i = array.length - 1; i >= 0; i--){
                if(array[i] != '#'){
                    list.add((char)(array[i] - '1' + 'a'));
                }else{
                    i -= 2;
                    int val = (array[i] - '0') * 10 + array[i + 1] - '0';
                    list.add((char)(val - 10 + 'j'));
                }
            }
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < list.size(); i++){
                builder.append(list.get(list.size() - 1 - i));
            }
            return builder.toString();
        }
    }
}
