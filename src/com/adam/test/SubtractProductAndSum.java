package com.adam.test;

public class SubtractProductAndSum {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.subtractProductAndSum(234));
    }

    static class Solution {
        public int subtractProductAndSum(int n) {
            int product = 1;
            int sum = 0;
            while(n > 0){
                int m = n % 10;
                product = product * m;
                sum = sum + m;
                n = n / 10;
            }
            return product - sum;
        }
    }
}
