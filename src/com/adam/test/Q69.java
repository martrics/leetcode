package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/18 22:22
 * version: 1.0.0
 */
public class Q69 {
    public static void main(String[] args) {
        int x = 6;
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(x));
    }

    static class Solution {
        public int mySqrt(int x) {
            if(x == 0 || x == 1){
                return x;
            }
            int left = 1;
            int right = x;
            int ans = 0;
            while(left <= right){
                int mid = left + (right - left) / 2;
                long product = (long) mid * mid;
                if(product < x){
                    ans = mid;
                    left = mid + 1;
                }else if(product > x){
                    right = mid - 1;
                }else{
                    return mid;
                }
            }
            return ans;
        }
    }
}
