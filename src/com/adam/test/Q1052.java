package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/23 13:39
 * version: 1.0.0
 */
public class Q1052 {
    public static void main(String[] args){
        int[] customers = new int[]{10, 1, 7};
        int[] grumpy = new int[]{0, 0, 0};
        int X = 2;
        Solution solution = new Solution();
        System.out.println(solution.maxSatisfied(customers, grumpy, X));
    }

    static class Solution {
        public int maxSatisfied(int[] customers, int[] grumpy, int X) {
            int count = 0;
            int max = 0;
            int n = customers.length;
            if(X >= n){
                for (int customer : customers) {
                    count += customer;
                }
                return count;
            }
            for(int i = 0; i < n; i++){
                if(grumpy[i] == 0){
                    count += customers[i];
                }
            }
            for(int i = 0; i <= n - X; i++){
                int xCount = 0;
                for(int j = i; j < X + i; j++){
                    if(grumpy[j] == 1){
                        xCount += customers[j];
                    }
                }
                max = Math.max(max, xCount);
            }
            return count + max;
        }
    }
}
