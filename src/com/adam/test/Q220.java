package com.adam.test;

import java.util.*;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/17 20:42
 * version: 1.0.0
 */
public class Q220 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            int n = nums.length;
            Map<Long, Long> map = new HashMap<Long, Long>();
            long w = (long) t + 1;
            for (int i = 0; i < n; i++) {
                long id = getId(nums[i], w);
                if (map.containsKey(id)) {
                    return true;
                }
                if (map.containsKey(id - 1) && Math.abs(nums[i] - map.get(id - 1)) < w) {
                    return true;
                }
                if (map.containsKey(id + 1) && Math.abs(nums[i] - map.get(id + 1)) < w) {
                    return true;
                }
                map.put(id, (long) nums[i]);
                if (i >= k) {
                    map.remove(getId(nums[i - k], w));
                }
            }
            return false;
        }

        private long getId(long x, long w) {
            if (x >= 0) {
                return x / w;
            }
            return (x + 1) / w - 1;
        }
    }
}
