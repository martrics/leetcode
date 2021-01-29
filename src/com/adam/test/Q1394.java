package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/19 14:52
 * version: 1.0.0
 */
public class Q1394 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int findLucky(int[] arr) {
            int[] hist = new int[501];
            for(int val: arr){
                hist[val]++;
            }
            for(int i = 500; i > 0; i--){
                if(hist[i] == i){
                    return i;
                }
            }
            return -1;
        }
    }
}
