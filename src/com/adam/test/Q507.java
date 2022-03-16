package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/18 20:05
 * version: 1.0.0
 */
public class Q507 {
    public static void main(String[] args) {
        int num = 496;
        Solution solution = new Solution();
        System.out.println(solution.checkPerfectNumber(num));
    }

    static class Solution {
        public boolean checkPerfectNumber(int num) {
            if(num < 6){
                return false;
            }
            int i = 2;
            int sum = 1;
            while(i * i <= num){
                if(num % i == 0){
                    sum += i;
                    if(num / i != i) {
                        sum += num / i;
                    }
                    if(sum > num){
                        return false;
                    }
                }
                i++;
            }
            return sum == num;
        }
    }
}
