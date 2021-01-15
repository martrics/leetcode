package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/15 16:17
 * version: 1.0.0
 */
public class Q1550 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] & 1) != 0) {
                    count++;
                } else {
                    count = 0;
                }
                if (count >= 3) {
                    return true;
                }
            }
            return false;
        }
    }
}
