package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/11 14:42
 * version: 1.0.0
 */
public class Q476 {
    public static void main(String[] args) {
        int num = 1;
        Solution solution = new Solution();
        System.out.println(solution.findComplement(num));
    }

    static class Solution{
        public int findComplement(int num) {
            int count = 0;
            int mask = 0;
            int n = num;
            while(num != 0){
                num = num >> 1;
                count++;
            }
            for(int i = 0; i < count - 1; i++){
                mask = mask | 0x1;
                mask = mask << 1;
            }
            mask = mask | 0x1;
            return ~n & mask ;
        }
    }
}
