package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 11:54
 * version: 1.0.0
 */
public class Q1385 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 5, 8};
        int[] arr2 = new int[]{10, 9, 1, 8};
        int d = 2;
        Solution solution = new Solution();
        System.out.println(solution.findTheDistanceValue(arr1, arr2, d));
    }

    static class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int count = 0;
            for(int val : arr1){
                boolean flag = true;
                for(int val2 : arr2){
                    if(Math.abs(val - val2) <= d){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
            return count;
        }
    }
}
