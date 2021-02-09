package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/2 9:57
 * version: 1.0.0
 */
public class Q424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        Solution solution = new Solution();
        System.out.println(solution.characterReplacement(s, k));
    }

    static class Solution{
        public int characterReplacement(String s, int k) {
            int n = s.length();
            if(n <= k){
                return n;
            }
            int[] nums = new int[26];
            int left = 0;
            int right = 0;
            int maxNum = 0;
            while(right < n){
                int index = s.charAt(right) - 'A';
                nums[index]++;
                maxNum = Math.max(maxNum, nums[index]);
                if(right - left + 1 - maxNum > k){
                    nums[s.charAt(left) - 'A']--;
                    left++;
                }
                right++;
            }
            return right - left;
        }
    }
}
