package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 11:58
 * version: 1.0.0
 */
public class Q1217 {
    public static void main(String[] args) {
        int[] position = new int[]{2, 2, 2, 3, 3};
        Solution solution = new Solution();
        System.out.println(solution.minCostToMoveChips(position));
    }

    static class Solution{
        public int minCostToMoveChips(int[] position) {
            int odd = 0;
            int even = 0;
            for(int val : position){
                if(val % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
            return Math.min(odd, even);
        }
    }
}
