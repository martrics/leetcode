package com.adam.test;

public class SumNums {
    public static void main(String[] args){
        int n = 9;
        Solution solution = new Solution();
        System.out.println(solution.sumNums(n));
    }

    static class Solution {
        public int sumNums(int n) {
            int sum = 0;
            boolean t = (n > 0) && ((sum += (n + sumNums(n - 1))) > 0);
            return sum;
        }
    }
}
