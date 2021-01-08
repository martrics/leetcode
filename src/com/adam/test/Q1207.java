package com.adam.test;

import java.util.Arrays;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/4 17:13
 * version: 1.0.0
 */
public class Q1207 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        Solution solution = new Solution();
        System.out.println(solution.uniqueOccurrences(arr));
    }

    static class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            int[] count = new int[arr.length];
            Arrays.sort(arr);
            int k = 0;
            int val = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != val) {
                    if (count[k] != 0) {
                        return false;
                    } else {
                        count[k] = k;
                        val = arr[i];
                        k = 1;
                    }
                }else{
                    k++;
                }
            }
            if(k == 1 && count[1] == 1){
                return false;
            }
            return true;
        }
    }
}
