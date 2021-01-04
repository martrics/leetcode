package com.adam.test;

public class MaximumWealth {
    public static void main(String[] args){
        int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        Solution solution = new Solution();
        System.out.println(solution.maximumWealth(accounts));
    }

    static class Solution{
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for(int[] account : accounts){
                int total = 0;
                for(int wealth : account){
                    total += wealth;
                }
                if(total > max){
                    max = total;
                }
            }
            return max;
        }
    }
}
