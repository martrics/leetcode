package com.adam.test;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 11:18
 * version: 1.0.0
 */
public class Offer40 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        int k = 2;
        Solution solution = new Solution();
        int[] res = solution.getLeastNumbers(arr, k);
        for(int val : res){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            if(arr.length == 0 || k == 0){
                return new int[0];
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>(k, Comparator.reverseOrder());
            int i = 0;
            for(i = 0; i < k; i++){
                queue.add(arr[i]);
            }
            for(; i < arr.length; i++){
                if(arr[i] < queue.peek()){
                    queue.poll();
                    queue.add(arr[i]);
                }
            }
            int[] ans = new int[k];
            for(i = k - 1; i >= 0; i--){
                ans[i] = queue.poll();
            }
            return ans;
        }
    }
}
