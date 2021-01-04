package com.adam.test;

public class SwapNums {
    public static void main(String[] args){
        int[] numbers = new int[]{1, 2};
        Solution solution = new Solution();
        solution.swapNumbers(numbers);
        System.out.println(numbers[0] + ", " + numbers[1]);
    }

    static class Solution {
        public int[] swapNumbers(int[] numbers) {
            numbers[0] = numbers[0] ^ numbers[1];
            numbers[1] = numbers[0] ^ numbers[1];
            numbers[0] = numbers[0] ^ numbers[1];

            return numbers;
        }
    }
}
