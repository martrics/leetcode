package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/3 10:30
 * version: 1.0.0
 */
public class Q338 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] countBits(int num) {
            int[] ans = new int[num + 1];
            for(int i = 0; i <= num; i++){
                ans[i] = countBit(i);
            }
            return ans;
        }

        private int countBit(int num){
            int count = 0;
            while(num != 0){
                num = num & (num - 1);
                count++;
            }
            return count;
        }
    }
}
