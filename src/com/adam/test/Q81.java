package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/7 9:59
 * version: 1.0.0
 */
public class Q81 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 1, 1, 1};
        int target = 0;
        Solution solution = new Solution();
        System.out.println(solution.search(nums, target));
    }

    static class Solution {
        public boolean search(int[] nums, int target) {
            int n = nums.length;
            if(n == 0){
                return false;
            }
            if(n == 1){
                return nums[0] == target;
            }
            int left = 0;
            int right = n - 1;
            if(target == nums[0]){
                return true;
            }
            boolean leftOrRight = target > nums[0];
            while(left < right){
                while(left < right && nums[right] == nums[right - 1]){
                    right--;
                }
                while(left < right && nums[left] == nums[left + 1]){
                    left++;
                }
                int mid = (right - left) / 2 + left;
                if(nums[mid] == target){
                    return true;
                }
                if(nums[mid] >= nums[0]){
                    if(leftOrRight){
                        if(nums[mid] > target){
                            right = mid - 1;
                        }else{
                            left = mid + 1;
                        }
                    }else{
                        left = mid + 1;
                    }
                }else{
                    if(leftOrRight){
                        right = mid - 1;
                    }else{
                        if(nums[mid] > target){
                            right = mid - 1;
                        }else{
                            left = mid + 1;
                        }
                    }
                }
            }
            return nums[left] == target;
        }
    }
}
