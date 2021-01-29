package com.adam.test;

import java.net.Socket;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 17:30
 * version: 1.0.0
 */
public class Q1287 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10};
        Solution solution = new Solution();
        System.out.println(solution.findSpecialInteger(arr));
    }

    static class Solution {
        public int findSpecialInteger(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i + (n >> 2)] == arr[i]) {
                    return arr[i];
                }
            }
            return -1;
        }
    }
}
