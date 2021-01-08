package com.adam.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/7 10:55
 * version: 1.0.0
 */
public class Q1030 {
    public static void main(String[] args) {
        int R = 2;
        int C = 3;
        int r0 = 1;
        int c0 = 2;
        Solution solution = new Solution();
        int[][] result = solution.allCellsDistOrder(R, C, r0, c0);
        for(int[] arr : result){
            System.out.println(arr[0] + "\t" + arr[1]);
        }

    }

    static class Solution{
        public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
            Map<int[], Integer> map = new HashMap<>();
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    int[] cord = new int[]{i, j};
                    map.put(cord, Math.abs(i - r0) + Math.abs(j - c0));
                }
            }
            int[][] result = new int[R * C][];
            int i = 0;
            for(int[] arr : map.keySet()){
                result[i++] = arr;
            }
            Arrays.sort(result, Comparator.comparingInt(map::get));
            return result;
        }
    }
}
