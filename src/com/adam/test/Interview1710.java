package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 17:29
 * version: 1.0.0
 */
public class Interview1710 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int majorityElement(int[] nums) {
            int major = nums[0];
            int count = 1;
            for(int i = 1; i < nums.length; i++){
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
            return major;
        }
    }
}
