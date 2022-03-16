package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/18 22:17
 * version: 1.0.0
 */
public class Q941 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean validMountainArray(int[] arr) {
            int n = arr.length;
            if(n < 3){
                return false;
            }
            int index = 0;
            while(index < n - 1 && arr[index] < arr[index + 1]){
                index++;
            }
            if(index == n - 1 ){
                return false;
            }
            while(index < n - 1 && arr[index] > arr[index + 1]){
                index++;
            }
            return index == n - 1;
        }
    }
}
