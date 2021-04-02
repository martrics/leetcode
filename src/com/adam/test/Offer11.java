package com.adam.test;

import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 19:22
 * version: 1.0.0
 */
public class Offer11 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 1};
        Solution solution = new Solution();
        System.out.println(solution.minArray(numbers));
    }

    static class Solution {
        public int minArray(int[] numbers) {
            int low = 0, high = numbers.length - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if(numbers[mid] < numbers[high]){
                    high = mid;
                }else if(numbers[mid] > numbers[high]){
                    low = mid + 1;
                }else{
                    high--;
                }
            }
            return numbers[low];
        }
    }
}
