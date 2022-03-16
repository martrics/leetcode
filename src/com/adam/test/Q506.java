package com.adam.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/12 22:04
 * version: 1.0.0
 */
public class Q506 {
    public static void main(String[] args) {
        int[] score = new int[]{5, 4, 3, 2, 1};
        Solution solution = new Solution();
        String[] ans = solution.findRelativeRanks(score);
        for(String str : ans){
            System.out.print(str + "\t");
        }
    }

    static class Solution{
        public String[] findRelativeRanks(int[] score) {
            int n = score.length;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                map.put(score[i], i);
            }
            String[] medal = new String[n];
            Arrays.sort(score);
            int j = n;
            for(int i = 0; i < n; i++){
                int val = map.get(score[i]);
                if(j == 1){
                    medal[val] = "Gold Medal";
                }else if(j == 2){
                    medal[val] = "Silver Medal";
                }else if(j == 3){
                    medal[val] = "Bronze Medal";
                }else{
                    medal[val] = String.valueOf(j);
                }
                j--;
            }
            return medal;
        }
    }
}
