package com.adam.test;

public class PrintNumbers {
    public static void main(String[] args) {
        int n = 2;
        Solution solution = new Solution();
        int[] result = solution.printNumbers(n);
        for(int num : result){
            System.out.print(num + "\t");
        }
    }

    static class Solution{
        public int[] printNumbers(int n) {
            int len = 1;
            while(n > 0){
                len = len * 10;
                n--;
            }
            int[] result = new int[len - 1];
            for(int i = 0; i < result.length; i++){
                result[i] = i + 1;
            }
            return result;
        }
    }
}
