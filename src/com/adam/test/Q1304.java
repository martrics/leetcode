package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/31 16:19
 * version: 1.0.0
 */
public class Q1304 {
    public static void main(String[] args) {
        int n = 4;
        Solution solution = new Solution();
        int[] result = solution.sumZero(n);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public int[] sumZero(int n) {
            int[] result = new int[n];
            if(n % 2 == 0){
                int k = n / 2;
                for(int i = 0; i < k; i++){
                    result[i] = i - k;
                    result[i + k] = i + 1;
                }
            }else{
                for(int i = 0; i < n; i++){
                    result[i] = 0 - n / 2 + i;
                }
            }
            return result;
        }
    }
}
