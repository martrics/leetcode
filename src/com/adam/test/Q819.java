package com.adam.test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/11 22:32
 * version: 1.0.0
 */
public class Q819 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        Solution solution = new Solution();
        System.out.println(solution.mostCommonWord(paragraph, banned));
    }

    static class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            int n = paragraph.length();
            List<String> list = new ArrayList<>();
            for(int i = 0; i < n;){
                StringBuilder builder = new StringBuilder();
                while(i < n && !isAlphabet(paragraph.charAt(i))){
                    i++;
                }
                while(i < n && isAlphabet(paragraph.charAt(i))){
                    char c = paragraph.charAt(i);
                    if(c >= 'A' && c <= 'Z'){
                        c = (char) (c - 'A' + 'a');
                    }
                    builder.append(c);
                    i++;
                }
                list.add(builder.toString());
            }
            Set<String> set = new HashSet<>(Arrays.asList(banned));
            Map<String, Integer> map = new HashMap<>();
            int max = 0;
            String ans = "";
            for(String str : list){
                if(!set.contains(str)){
                    Integer count = map.get(str);
                    if(count == null){
                        count = 0;
                    }
                    map.put(str, count + 1);
                    if(count + 1 > max){
                        max = count + 1;
                        ans = str;
                    }
                }
            }
            return ans;
        }

        private boolean isAlphabet(char c){
            return c >= 'a' && c <= 'z' || c>='A' && c <= 'Z';
        }
    }
}
