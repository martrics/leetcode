package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/24 13:44
 * version: 1.0.0
 */
public class Q401 {
    public static void main(String[] args) {
        int num = 1;
        Solution solution = new Solution();
        List<String> list = solution.readBinaryWatch(num);
        for (String str : list) {
            System.out.print(str + "\t");
        }
    }

    static class Solution {
        private final List<String> result = new ArrayList<>();
        private final int[] nums = new int[]{8, 4, 2, 1, 32, 16, 8, 4, 2, 1};

        public List<String> readBinaryWatch(int num) {
            if (num < 0) {
                return result;
            }

            backTrack(num, 0, 0, 0);
            return result;
        }

        public void backTrack(int num, int start, int hour, int minute) {
            if (hour > 11 || minute > 59) {
                return;
            }
            if (num == 0) {
                //判断时间是否正确
                StringBuilder tmp = new StringBuilder();
                //小时
                tmp.append(hour).append(":");
                //分钟
                if (minute < 10) {
                    tmp.append(0);
                }
                tmp.append(minute);
                result.add(tmp.toString());
                return;
            }
            for (int i = start; i < nums.length; i++) {
                /*回溯做选择*/
                //判断是小时还是分钟
                if (i < 4){
                    hour += nums[i];
                } else {
                    minute += nums[i];
                }
                //递归
                backTrack(num - 1, i + 1, hour, minute);
                /*回溯取消选择*/
                if (i < 4){
                    hour -= nums[i];
                } else {
                    minute -= nums[i];
                }
            }
        }
    }
}
