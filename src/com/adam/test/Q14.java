package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/18 21:25
 * version: 1.0.0
 */
public class Q14 {
    public static void main(String[] args) {
        String[] strs = new String[]{""};
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length == 0){
                return "";
            }
            int len = Integer.MAX_VALUE;
            for(String str : strs){
                len = Math.min(len, str.length());
            }
            if(len == 0){
                return "";
            }
            int count = 0;

            for(int i = 0; i < len; i++){
                boolean flag = false;
                char c = strs[0].charAt(i);
                for(String str : strs){
                    if(str.charAt(i) != c){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
                count++;
            }
            return strs[0].substring(0, count);
        }
    }
}
