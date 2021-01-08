package com.adam.test;

import java.util.Stack;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 11:45
 * version: 1.0.0
 */
public class Q852 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 0};
        Solution solution = new Solution();
        System.out.println(solution.peakIndexInMountainArray(arr));
    }

    static class Solution{
        public int peakIndexInMountainArray(int[] arr) {
            int result = 0;
            int max = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                    result = i;
                }
            }
            return result;
        }
    }
}
