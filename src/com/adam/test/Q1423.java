package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/6 9:38
 * version: 1.0.0
 */
public class Q1423 {
    public static void main(String[] args) {
        int[] cardPoints = new int[]{1, 79, 80, 1, 1, 1, 200, 1};
        int k = 3;
        Solution solution = new Solution();
        System.out.println(solution.maxScore(cardPoints, k));
    }

    static class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int n = cardPoints.length;
            if(n == 0 || k == 0){
                return 0;
            }
            int sum = 0;
            int leftSum = 0;
            for(int i = 0; i < n; i++){
                sum += cardPoints[i];
                if(i == n - k - 1){
                    leftSum = sum;
                }
            }
            int min = leftSum;
            for(int i = 1; i <= k; i++){
                leftSum -= cardPoints[i - 1];
                leftSum += cardPoints[i + n - k - 1];
                min = Math.min(leftSum, min);
            }
            return sum - min;
        }
    }
}
