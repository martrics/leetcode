package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/5 16:03
 * version: 1.0.0
 */
public class Q1009 {
    public static void main(String[] args) {
        int N = 7;
        Solution solution = new Solution();
        System.out.println(solution.bitwiseComplement(N));
    }

    static class Solution{
        public int bitwiseComplement(int N) {
            if(N == 0){
                return 1;
            }
            int n = N;
            int mask = 0x0;
            while(n != 0){
                n = n >> 1;
                mask = mask | 1;
                mask = mask << 1;
            }
            mask = mask >> 1;
            return ((-N) - 1) & mask;
        }
    }
}
