package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/12 23:41
 * version: 1.0.0
 */
public class Q697 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 1, 2, 1, 3, 3, 3, 1, 3, 1, 3, 2};
        Solution solution = new Solution();
        System.out.println(solution.findShortestSubArray(nums));
    }

    static class Solution {
        public int findShortestSubArray(int[] nums) {
            int[] freq = new int[50000];
            int max = 0;
            List<Integer> list = new ArrayList<>();
            for (int val : nums) {
                freq[val]++;
                max = Math.max(max, freq[val]);
            }
            for(int i = 0; i < freq.length; i++){
                if(freq[i] == max){
                    list.add(i);
                }
            }
            int ans = Integer.MAX_VALUE;
            for(int val : list){
                int maxNum = max;
                int j = 0;
                int i = 0;
                while (nums[i] != val) {
                    i++;
                }
                j = i;
                while (maxNum > 0) {
                    if (nums[i] == val) {
                        maxNum--;
                    }
                    i++;
                }
                ans = Math.min(ans, i - j);
            }

            return ans;
        }
    }
}
