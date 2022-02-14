package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/9 16:32
 * version: 1.0.0
 */
public class Q367 {
    public static void main(String[] args) {
        int num = 2147395600;
        Solution solution = new Solution();
        System.out.println(solution.isPerfectSquare(num));
    }

    static class Solution{
        public boolean isPerfectSquare(int num) {
            if(num < 2){
                return true;
            }
            int low = 1;
            int high = num / 2;
            while(low <= high){
                int mid = low + (high - low) / 2;
                long val = (long) mid * mid;
                if(val == num){
                    return true;
                }else if(val > num){
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
            return false;
        }
    }
}
