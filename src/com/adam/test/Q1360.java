package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/23 18:40
 * version: 1.0.0
 */
public class Q1360 {
    public static void main(String[] args) {
        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        Solution solution = new Solution();
        System.out.println(solution.daysBetweenDates(date1, date2));
    }

    static class Solution {
        public int daysBetweenDates(String date1, String date2) {
            return Math.abs(dayCount(date1) - dayCount(date2));
        }

        private int dayCount(String date) {
            int i, d = 0;
            int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (i = 1971; i <= Integer.parseInt(date.substring(0, 4)); i++) {
                d += (i % 4 == 0 && i % 100 != 0) || i % 400 == 0 ? 366 : 365;
            }
            i--;
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                days[1] = 29;
            }
            for (int j = 11; j >= Integer.parseInt(date.substring(5, 7)) - 1; j--) {
                d -= days[j];
            }
            return d + Integer.parseInt(date.substring(8));
        }
    }
}
