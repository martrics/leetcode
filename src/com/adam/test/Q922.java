package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/6 17:35
 * version: 1.0.0
 */
public class Q922 {
    public static void main(String[] args) {
        int[] A = new int[]{4, 2, 5, 7};
        Solution solution = new Solution();
        int[] result = solution.sortArrayByParityII(A);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int[] result = new int[A.length];
            int evenIndex = 0;
            int oddIndex = 1;
            for(int i = 0; i < A.length; i++){
                if(A[i] % 2 == 0){
                    result[evenIndex] = A[i];
                    evenIndex += 2;
                }else{
                    result[oddIndex] = A[i];
                    oddIndex += 2;
                }
            }
            return result;
        }
    }
}
