package com.adam.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/22 9:39
 * version: 1.0.0
 */
public class Interview0104 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean canPermutePalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for(char c : s.toCharArray()){
                map.merge(c, 1, Integer::sum);
            }
            boolean flag = false;
            for(int val : map.values()){
                if(flag && (val & 0x1) == 1){
                    return false;
                }
                if((val & 0x1) == 1){
                    flag = true;
                }
            }
            return true;
        }
    }
}
