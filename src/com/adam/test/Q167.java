package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 10:58
 * version: 1.0.0
 */
public class Q167 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int[] twoSum(int[] numbers, int target) {
            int n = numbers.length;
            int i = 0;
            int j = n - 1;
            while(i < j){
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i + 1, j + 1};
                }else if(numbers[i] + numbers[j] > target){
                    j--;
                }else{
                    i++;
                }
            }
            return new int[]{0, 0};
        }
    }
}
