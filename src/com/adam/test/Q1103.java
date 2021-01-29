package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/27 19:05
 * version: 1.0.0
 */
public class Q1103 {
    public static void main(String[] args) {
        int candies = 10;
        int num_people = 3;
        Solution solution = new Solution();
        int[] ans = solution.distributeCandies(candies, num_people);
        for(int val : ans){
            System.out.print(val + "\t");
        }
    }

    static class Solution{
        public int[] distributeCandies(int candies, int num_people) {
            int[] ans = new int[num_people];
            int i = 0;
            int j = 1;
            while(candies > 0){
                ans[i++ % num_people] += Math.min(j, candies);
                candies -= j++;
            }
            return ans;
        }
    }
}
