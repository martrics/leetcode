package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 11:12
 * version: 1.0.0
 */
public class HammingWeight {
    public static void main(String[] args) {
        int n = 0b11111111111111111111111111111101;
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(n));
    }

    static class Solution{
        public int hammingWeight(int n) {
            int count = 0;
            if(n < 0){
                count++;
                n = n & 0x7FFFFFFF;
            }
            while(n != 0){
                n = n & (n - 1);
                count++;
            }
            return count;
        }
    }
}
