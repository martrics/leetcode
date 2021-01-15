package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 17:00
 * version: 1.0.0
 */
public class Q821 {
    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        Solution solution = new Solution();
        int[] result = solution.shortestToChar(S, C);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public int[] shortestToChar(String S, char C) {
            List<Integer> list = new ArrayList<>();
            int n = S.length();
            int[] result = new int[n];
            for(int i = 0; i < n; i++){
                if(S.charAt(i) == C){
                    list.add(i);
                }
            }
            for(int i = 0; i <= list.get(0); i++){
                result[i] = list.get(0) - i;
            }
            int m = list.size();
            for(int j = 1; j < m; j++){
                int start = list.get(j - 1);
                int end = list.get(j);
                for(int k = start; k <= end; k++){
                    result[k] = Math.min(k - start, end - k);
                }
            }
            for(int i = list.get(m - 1); i < n; i++){
                result[i] = i - list.get(m - 1);
            }
            return result;
        }
    }
}
