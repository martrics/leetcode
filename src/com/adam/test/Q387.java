package com.adam.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/5 9:16
 * version: 1.0.0
 */
public class Q387 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int firstUniqChar(String s) {
            if(s.length() == 0){
                return -1;
            }
            Map<Character, Integer> map = new LinkedHashMap<>();
            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for(int i = 0; i < s.length(); i++){
                if(map.get(s.charAt(i)) == 1){
                    return i;
                }
            }
            return -1;
        }
    }
}
