package com.adam.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author adam
 */
public class Q205 {
    public static void main(String[] args) {
        String s = "title";
        String t = "paper";
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic(s, t));

    }

    static class Solution{
        public boolean isIsomorphic(String s, String t) {
            Map<Character, Character> map = new HashMap<>();
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < s.length(); i++){
                char ss = s.charAt(i);
                char tt = t.charAt(i);
                Character rr = map.get(ss);
                if(rr == null && !set.contains(tt)) {
                    map.put(ss, tt);
                    set.add(tt);
                }
                rr = map.get(ss);
                if(rr == null || rr != tt){
                    return false;
                }

            }
            return true;
        }
    }
}
