package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/13 13:51
 * version: 1.0.0
 */
public class Q1154 {
    public static void main(String[] args) {
        String date = "2004-03-01";
        Solution solution = new Solution();
        System.out.println(solution.dayOfYear(date));
    }

    static class Solution{
        public int dayOfYear(String date) {
            String[] str = date.split("-");
            int year = Integer.parseInt(str[0]);
            int month = Integer.parseInt(str[1]);
            int day = Integer.parseInt(str[2]);
            int[] dayOfMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                dayOfMonth[1] = 29;
            }
            int ans = 0;
            for(int i = 0; i < month - 1; i++){
                ans += dayOfMonth[i];
            }
            ans += day;
            return ans;
        }
    }
}
