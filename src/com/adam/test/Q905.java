package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 16:42
 * version: 1.0.0
 */
public class Q905 {
    public static void main(String[] args) {
        int[] A = new int[]{3, 1, 2, 4};
        Solution solution = new Solution();
        int[] result = solution.sortArrayByParity(A);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] sortArrayByParity(int[] A) {
            int n = A.length;
            int[] arr = new int[n];
            int i = 0;
            int j = n - 1;
            for (int value : A) {
                if ((value & 0x1) == 0) {
                    arr[i++] = value;
                } else {
                    arr[j--] = value;
                }
            }
            return arr;
        }
    }
}
