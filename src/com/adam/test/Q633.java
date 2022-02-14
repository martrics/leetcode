package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/28 9:46
 * version: 1.0.0
 */
public class Q633 {
    public static void main(String[] args) {
        int c = 3;
        Solution solution = new Solution();
        System.out.println(solution.judgeSquareSum(c));
    }

    static class Solution {
        public boolean judgeSquareSum(int c) {
            if(c == 0 || c == 1){
                return true;
            }
            int right = (int) Math.sqrt(c);
            int left = 0;
            while(left <= right){
                int sum = left * left + right * right;
                if(sum == c){
                    return true;
                }else if(sum > c){
                    right--;
                }else{
                    left++;
                }
            }
            return false;
        }
    }
}
