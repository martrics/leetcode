package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/11 15:17
 * version: 1.0.0
 */
public class Q389 {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        Solution solution = new Solution();
        System.out.println(solution.findTheDifference(s, t));
    }

    static class Solution{
        public char findTheDifference(String s, String t) {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            int i = 0;
            for(; i < sArray.length; i++){
                if(sArray[i] != tArray[i]){
                    return tArray[i];
                }
            }
            return tArray[i];
        }
    }
}
