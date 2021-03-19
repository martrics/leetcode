package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/25 9:51
 * version: 1.0.0
 */
public class Offer53I {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2};
        int target = 2;
        Solution solution = new Solution();
        System.out.println(solution.search(nums, target));
    }

    static class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            int left = 0;
            int right = n - 1;
            int count = 0;
            while(left <= right){
                int mid = left + ((right - left) >> 1);
                if(nums[mid] > target){
                    right = mid - 1;
                }else if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    count++;
                    for(int i = mid + 1; i < n; i++){
                        if(nums[i] == nums[mid]){
                            count++;
                        }
                    }
                    for(int i = mid - 1; i >= 0; i--){
                        if(nums[i] == nums[mid]){
                            count++;
                        }
                    }
                    break;
                }
            }
            return count;
        }
    }
}
