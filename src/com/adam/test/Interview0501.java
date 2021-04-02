package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 18:59
 * version: 1.0.0
 */
public class Interview0501 {
    public static void main(String[] args) {
        int N = 2032243561;
        int M = 10;
        int i = 24;
        int j = 29;
        Solution solution = new Solution();
        System.out.println(solution.insertBits(N, M, i, j));
    }

    static class Solution{
        public int insertBits(int N, int M, int i, int j) {
            if(i == j){
                return N;
            }
            int k = i;
            while(k > 0){
                M = M << 1;
                k--;
            }
            k = j - i - 1;
            int mask = 0x1;
            while(k >= 0){
                mask = mask << 1;
                mask |= 0x1;
                k--;
            }
            k = i;
            while(k > 0){
                mask = mask << 1;
                k--;
            }
            return (N & (~mask)) | M;
        }
    }
}
