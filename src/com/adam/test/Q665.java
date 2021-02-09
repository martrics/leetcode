package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/7 9:25
 * version: 1.0.0
 */
public class Q665 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 1, 2};
        Solution solution = new Solution();
        System.out.println(solution.checkPossibility(nums));
    }

    static class Solution {
        public boolean checkPossibility(int[] nums) {
            int n = nums.length;
            if(n <= 2){
                return true;
            }
            boolean flag = true;
            for(int i = 0; i < n - 2; i++){
                if(nums[i] > nums[i + 1]){
                    if(nums[i + 1] > nums[i + 2]){
                        return false;
                    }else{
                        if(!flag){
                            return false;
                        }else{
                            flag = false;
                        }
                    }
                }else{
                    if(nums[i + 1] > nums[i + 2]){
                        if(nums[i] <= nums[i + 2]){
                            if(!flag){
                                return false;
                            }else{
                                nums[i + 1] = nums[i + 2];
                                flag = false;
                            }
                        }else{
                            if(!flag){
                                return false;
                            }else{
                                nums[i + 2] = nums[i + 1];
                                flag = false;
                            }
                        }
                    }
                }
            }
            return true;
        }
    }
}
