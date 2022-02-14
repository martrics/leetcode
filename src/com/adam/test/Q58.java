package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/21 15:18
 * version: 1.0.0
 */
public class Q58 {
    public static void main(String[] args) {
        String s = "   ";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord(s));
    }

    static class Solution {
        public int lengthOfLastWord(String s) {
            int n = s.length();
            if(n == 0){
                return 0;
            }
            int i = n - 1;
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            int j = i;
            for(; j >= 0; j--){
                if(s.charAt(j) == ' '){
                    break;
                }
            }
            return i - j;
        }
    }
}
