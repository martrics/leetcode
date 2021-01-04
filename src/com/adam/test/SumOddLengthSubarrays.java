package com.adam.test;

public class SumOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 5, 3};
        Solution solution = new Solution();
        System.out.println(solution.sumOddLengthSubarrays(arr));
    }

    static class Solution {
        public int sumOddLengthSubarrays(int[] arr) {
            int total = 0;
            for(int i = 1; i <= arr.length; i += 2){
                for(int j = 0; j <= arr.length - i; j++){
                    for(int k = 0; k < i; k++){
                        total += arr[j + k];
                    }
                }
            }
            return total;
        }
    }
}
