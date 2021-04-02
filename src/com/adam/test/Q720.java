package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/26 16:51
 * version: 1.0.0
 */
public class Q720 {
    public static void main(String[] args) {
        String[] words = new String[]{"w","wo","wor","worl", "world"};
        Solution solution = new Solution();
        System.out.println(solution.longestWord(words));
    }

    static class Solution{
        public String longestWord(String[] words) {
            if(words.length == 1){
                return "";
            }
            Set<String> set = new HashSet<>();
            Collections.addAll(set, words);
            Arrays.sort(words, (o1, o2) -> {
                if(o1.length() < o2.length()){
                    return 1;
                }else if(o1.length() > o2.length()){
                    return -1;
                }else{
                    return o1.compareTo(o2);
                }
            });
            boolean flag = true;
            for(String word : words){
                String str = word;
                while(str.length() > 1){
                    str = str.substring(0, str.length() - 1);
                    if(!set.contains(str)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return word;
                }else{
                    flag = true;
                }
            }
            return "";
        }
    }
}
