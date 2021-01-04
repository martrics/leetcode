package com.adam.test;

import java.util.Arrays;

public class FindContentChildren {
    public static void main(String[] args) {
        int[] g = new int[]{1, 2, 3};
        int[] s = new int[]{1, 2};
        Solution solution = new Solution();
        System.out.println(solution.findContentChildren(g, s));
    }

    static class Solution {
        public int findContentChildren(int[] g, int[] s) {
            if(g.length == 0 || s.length == 0){
                return 0;
            }
            int total = 0;
            Arrays.sort(g);
            Arrays.sort(s);
            int i = 0;
            int j = 0;
            for(;i < g.length; i++ ){
                if(j == s.length){
                    return total;
                }
                while(j < s.length && (s[j] < g[i])){
                    j++;
                }
                if((j < s.length) && (s[j] >= g[i])){
                    j++;
                    total++;
                }
            }
            return total;
        }
    }
}
