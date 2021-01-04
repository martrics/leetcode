package com.adam.test;

public class NumberOfSteps {
    public static void main(String[] args){
        int num = 123;
        Solution solution = new Solution();
        System.out.println(solution.numberOfSteps(num));
    }

    static class Solution {
        public int numberOfSteps (int num) {
            int steps = 0;
            while(num != 0){
                if((num & 0b1) == 0 || num == 1){
                    steps += 1;
                }else{
                    steps += 2;
                }
                num = num >> 1;
            }
            return steps;
        }
    }
}
