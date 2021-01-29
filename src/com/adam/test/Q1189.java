package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 16:54
 * version: 1.0.0
 */
public class Q1189 {
    public static void main(String[] args) {
        String text = "balon";
        Solution solution = new Solution();
        System.out.println(solution.maxNumberOfBalloons(text));
    }

    static class Solution{
        public int maxNumberOfBalloons(String text) {
            int[] num = new int[26];
            for(char c : text.toCharArray()){
                num[c - 'a']++;
            }
            num['o' - 'a'] = num['o' - 'a'] >> 1;
            num['l' - 'a'] = num['l' - 'a'] >> 1;
            int min = Integer.MAX_VALUE;
            for(char c : "balloon".toCharArray()){
                if(num[c - 'a'] < min){
                    min = num[c - 'a'];
                }
            }
            return min;
        }
    }
}
