package com.adam.test;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/11 13:37
 * version: 1.0.0
 */
public class Q703 {
    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{5, -1});
        System.out.println(kthLargest.add(2));
        System.out.println(kthLargest.add(1));
        System.out.println(kthLargest.add(-1));
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(4));
    }

    static class KthLargest{
        private int[] kTh;
        private int k;
        private int len;

        public KthLargest(int k, int[] nums) {
            kTh = new int[k];
            this.k = k;
            len = 0;
            Arrays.sort(nums);
            int size = Math.min(nums.length, k);
            for(int i = 0; i < size; i++){
                kTh[i] = nums[nums.length - size + i];
                len++;
            }
        }

        public int add(int val) {
            if(len < k){
                //one less at most
                if(len == 0){
                    kTh[0] = val;
                }else {
                    if (val > kTh[len - 1]) {
                        kTh[len] = val;
                    } else if (val <= kTh[0]) {
                        for (int j = len; j > 0; j--) {
                            kTh[j] = kTh[j - 1];
                        }
                        kTh[0] = val;
                    } else {
                        for (int i = len - 1; i >= 0; i--) {
                            if (kTh[i] < val) {
                                for (int j = len; j > i; j--) {
                                    kTh[j] = kTh[j - 1];
                                }
                                kTh[i + 1] = val;
                                break;
                            }
                        }
                    }
                }
                len++;
            }else {
                if (val > kTh[0]) {
                    for (int j = k - 1; j >= 0; j--) {
                        if (val > kTh[j]) {
                            for (int m = 0; m <= j - 1; m++) {
                                kTh[m] = kTh[m + 1];
                            }
                            kTh[j] = val;
                            break;
                        }
                    }
                }
            }
            return kTh[0];
        }
    }
}
