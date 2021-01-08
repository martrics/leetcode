package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 17:06
 * version: 1.0.0
 */
public class Offer57 {
    public static void main(String[] args) {
        int target = 9;
        Solution solution = new Solution();
        int[][] result = solution.findContinuousSequence(target);
        for(int[] arr : result){
            for(int val : arr){
                System.out.print(val + "\t");
            }
            System.out.print("\n");
        }
    }

    static class Solution{
        public int[][] findContinuousSequence(int target) {
            List<int[]> list = new ArrayList<>();
            for(int i = 1; i < target / 2 + 1; i++){
                for(int j = 2; j < target - i; j++){
                    if(target * 2 % j != 0){
                        continue;
                    }
                    int sum = (2 * i + j - 1) * j / 2;
                    if(sum == target){
                        int[] arr = new int[j];
                        for(int k = 0; k < j; k++){
                            arr[k] = i + k;
                        }
                        list.add(arr);
                        break;
                    }else if(sum > target){
                        break;
                    }
                }
            }
            int[][] result = new int[list.size()][];
            for(int i = 0; i < list.size(); i++){
                result[i] = list.get(i);;
            }
            return result;
        }
    }
}
