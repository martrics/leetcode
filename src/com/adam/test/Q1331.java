package com.adam.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/24 19:08
 * version: 1.0.0
 */
public class Q1331 {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 100, 100};
        Solution solution = new Solution();
        int[] ans = solution.arrayRankTransform(arr);
        for(int val : ans){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] arrayRankTransform(int[] arr) {
            int n = arr.length;
            if(n == 0){
                return arr;
            }
            int[] orderd = new int[n];
            System.arraycopy(arr, 0, orderd, 0, n);
            Arrays.sort(orderd);
            int start = 1;
            Map<Integer, Integer> map = new HashMap<>();
            map.put(orderd[0], start);
            for(int i = 1; i < n; i++){
                if(orderd[i] != orderd[i - 1]){
                    start++;
                }
                map.put(orderd[i], start);
            }
            for(int i = 0; i < n; i++){
                orderd[i] = map.get(arr[i]);
            }
            return orderd;
        }
    }
}
