package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 11:39
 * version: 1.0.0
 */
public class Q1502 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.canMakeArithmeticProgression(arr));
    }

    static class Solution{
        public boolean canMakeArithmeticProgression(int[] arr) {
            if(arr == null || arr.length < 2){
                return false;
            }
            Arrays.sort(arr);
            int differ = arr[1] - arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] - arr[i - 1] != differ){
                    return false;
                }
            }
            return true;
        }
    }
}
