package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 17:38
 * version: 1.0.0
 */
public class Q1446 {
    public static void main(String[] args) {
        String s = "abbbb";
        Solution solution = new Solution();
        System.out.println(solution.maxPower(s));
    }

    static class Solution{
        public int maxPower(String s) {
            int max = 0;
            int n = s.length();
            for(int i = 0; i < n;){
                int j = i;
                while(j < n && s.charAt(j) == s.charAt(i)){
                    j++;
                }
                max = Math.max(max, j - i);
                i = j;
            }
            return max;
        }
    }
}
