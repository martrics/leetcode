package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 13:52
 * version: 1.0.0
 */
public class Q303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }

    static class NumArray {
        private int[] sum;

        public NumArray(int[] nums) {
            int n = nums.length;
            if(n == 0){
                return;
            }
            sum = new int[n + 1];
            sum[0] = nums[0];
            for(int i = 1; i < n; i++){
                sum[i] = sum[i - 1] + nums[i];
            }

        }

        public int sumRange(int i, int j) {
            if(i == 0){
                return sum[j];
            }else {
                return sum[j] - sum[i - 1];
            }
        }
    }
}
