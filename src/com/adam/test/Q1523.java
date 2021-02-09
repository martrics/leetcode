package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 11:49
 * version: 1.0.0
 */
public class Q1523 {
    public static void main(String[] args) {
        int low = 8;
        int high = 10;
        Solution solution = new Solution();
        System.out.println(solution.countOdds(low, high));
    }

    static class Solution{
        public int countOdds(int low, int high) {
            int count = high - low + 1;
            if((count & 0x1) == 0){
                return count >> 1;
            }else{
                if((low & 0x1) == 0){
                    return count >> 1;
                }else{
                    return count - (count >> 1);
                }
            }
        }
    }
}
