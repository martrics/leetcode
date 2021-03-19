package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/12 11:41
 * version: 1.0.0
 */
public class Q392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence(s, t));
    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {
            t = " " + t;
            int n = t.length();
            int[][] dp = new int[n][26];
            for(int i = n - 1; i >= 0; i--){
                for(int j = 0; j < i; j++){
                    dp[j][t.charAt(i) - 'a'] = i;
                }
            }

            int i = 0;
            for(char c : s.toCharArray()){
                i = dp[i][c - 'a'];
                if(i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
