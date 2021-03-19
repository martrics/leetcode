package com.adam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/23 17:06
 * version: 1.0.0
 */
public class Q350 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        Solution solution = new Solution();
        int[] ans = solution.intersect(nums1, nums2);
        for(int val : ans){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> list = new ArrayList<>();
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            while(i < nums1.length && j < nums2.length){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    i++;
                    j++;
                }else if(nums1[i] > nums2[j]){
                    j++;
                }else{
                    i++;
                }
            }
            int[] ans = new int[list.size()];
            for(i = 0; i < list.size(); i++){
                ans[i] = list.get(i);
            }
            return ans;
        }
    }
}
