package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 17:29
 * version: 1.0.0
 */
public class Interview1710 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(nums));
    }

    static class Solution{
        public int majorityElement(int[] nums) {
            int n = nums.length;
            int major = nums[0];
            int count = 1;
            for(int i = 1; i < n; i++){
                if(nums[i] == major){
                    count++;
                }else{
                    count--;
                    if(count < 0){
                        major = nums[i];
                        count = 1;
                    }
                }
            }
            count = 1;
            int major2 = nums[n - 1];
            for(int i = n - 2; i >= 0; i--){
                if(nums[i] == major2){
                    count++;
                }else{
                    count--;
                    if(count < 0){
                        major2 = nums[i];
                        count = 1;
                    }
                }
            }
            return major == major2? major : -1;
        }
    }
}
