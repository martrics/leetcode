package com.adam.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/6 13:39
 * version: 1.0.0
 */
public class Q290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        Solution solution = new Solution();
        System.out.println(solution.wordPattern(pattern, str));
    }

    static class Solution{
        public boolean wordPattern(String pattern, String s) {
            String[] arr = s.split(" ");
            if(arr.length != pattern.length()){
                return false;
            }
            Map<Character, String> map = new HashMap<>();
            Set<String> set = new HashSet<>();
            for(int i = 0; i < arr.length; i++){
                String str = map.get(pattern.charAt(i));
                if(str == null){
                    if(set.contains(arr[i])){
                        return false;
                    }else {
                        map.put(pattern.charAt(i), arr[i]);
                        set.add(arr[i]);
                    }
                }else{
                    if(!str.equals(arr[i])){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
