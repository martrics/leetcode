package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/29 17:36
 * version: 1.0.0
 */
public class Q1185 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dayOfTheWeek(29, 1, 2021));
    }

    static class Solution{
        public String dayOfTheWeek(int day, int month, int year) {
            if(month == 1 || month == 2){
                month += 12;
                year--;
            }
            int weekDay = (day + 2 * month + 3 * (month + 1) / 5 + year + year/4 - year/100 + year/ 400) % 7;
            String[] arr = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            return arr[weekDay];
        }
    }
}
