package com.adam.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 11:12
 * version: 1.0.0
 */
public class Q1710 {
    public static void main(String[] args) {
        int[][] boxTypes = new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;
        Solution solution = new Solution();
        System.out.println(solution.maximumUnits(boxTypes, truckSize));
    }

    static class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            int total = 0;
            boxTypes = Arrays.stream(boxTypes).sorted(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[1] - o1[1];
                }
            }).toArray(int[][]::new);
            for(int[] array : boxTypes){
                if(array[0] > truckSize){
                    total += truckSize * array[1];
                    break;
                }else{
                    truckSize -= array[0];
                    total += array[0] * array[1];
                }
            }
            return total;
        }
    }
}
