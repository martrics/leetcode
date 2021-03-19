package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/23 16:05
 * version: 1.0.0
 */
public class Q896 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 0};
        Solution solution = new Solution();
        System.out.println(solution.isMonotonic(A));
    }

    static class Solution {
        public boolean isMonotonic(int[] A) {
            int n = A.length;
            if(n <= 2){
                return true;
            }
            boolean order = true;
            int i = 1;
            while(i < n){
                if(A[i] != A[i - 1]){
                    order = A[i] > A[i - 1];
                    break;
                }else{
                    i++;
                }
            }
            for(i = 2; i < n; i++){
                if(order && A[i] < A[i - 1]){
                    return false;
                }
                if(!order && A[i] > A[i - 1]){
                    return false;
                }
            }
            return true;
        }
    }
}
