package com.adam.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/7 11:23
 * version: 1.0.0
 */
public class Q1507 {
    public static void main(String[] args) {
        String date = "1st Oct 2052";
        Solution solution = new Solution();
        System.out.println(solution.reformatDate(date));
    }

    static class Solution{
        public String reformatDate(String date) {
            String[] arr = date.split(" ");
            String day = arr[0];
            day = String.format("%02d", Integer.parseInt(day.substring(0, day.length() - 2)));
            String month = arr[1];
            String year = arr[2];
            Map<String, String> map = new HashMap<>();
            map.put("Jan", "01");
            map.put("Feb", "02");
            map.put("Mar", "03");
            map.put("Apr", "04");
            map.put("May", "05");
            map.put("Jun", "06");
            map.put("Jul", "07");
            map.put("Aug", "08");
            map.put("Sep", "09");
            map.put("Oct", "10");
            map.put("Nov", "11");
            map.put("Dec", "12");
            return year + "-" + map.get(month) + "-" + day;
        }
    }
}
