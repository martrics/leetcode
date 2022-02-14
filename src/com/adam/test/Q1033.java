package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/20 10:59
 * version: 1.0.0
 */
public class Q1033 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.numMovesStones(3, 5, 1)));
    }

    static class Solution {
        public int[] numMovesStones(int a, int b, int c) {
            int min = Math.min(Math.min(a, b), Math.min(b, c));
            int max = Math.max(Math.max(a, b), Math.max(b, c));
            int mid = a + b + c - min - max;
            int minSteps = 0;
            int maxSteps = 0;
            if (max - mid == 1) {
                minSteps = mid - min == 1 ? 0 : 1;
            } else if(max - mid == 2){
                minSteps = 1;
            }else {
                minSteps = (mid - min == 1 || mid - min == 2) ? 1 : 2;
            }
            while(max - mid > 1){
                maxSteps++;
                max--;
            }
            while(mid - min > 1){
                maxSteps++;
                min++;
            }
            return new int[]{minSteps, maxSteps};
        }
    }
}
