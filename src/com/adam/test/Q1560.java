package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 11:58
 * version: 1.0.0
 */
public class Q1560 {
    public static void main(String[] args) {
        int n = 7;
        int[] rounds = new int[]{1, 3, 5, 7};
        Solution solution = new Solution();
        List<Integer> list = solution.mostVisited(n, rounds);
        for(int val : list){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public List<Integer> mostVisited(int n, int[] rounds) {
            int[] freq = new int[n + 1];
            int len = rounds.length;
            for (int i = 1; i < len; i++) {
                if (rounds[i] > rounds[i - 1]) {
                    for (int j = rounds[i - 1]; j < rounds[i]; j++) {
                        freq[j]++;
                    }
                } else {
                    for (int j = rounds[i - 1]; j <= n; j++) {
                        freq[j]++;
                    }
                    for (int j = 1; j < rounds[i]; j++) {
                        freq[j]++;
                    }
                }
            }
            freq[rounds[len - 1]]++;
            List<Integer> list = new ArrayList<>();
            int max = 0;
            for (int val : freq) {
                max = Math.max(max, val);
            }
            for(int i = 0; i < freq.length; i++){
                if(freq[i] == max){
                    list.add(i);
                }
            }
            return list;
        }
    }
}
