package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 19:00
 * version: 1.0.0
 */
public class Interview0803 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int findMagicIndex(int[] nums) {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == i){
                    return i;
                }
            }
            return -1;
        }
    }
}
