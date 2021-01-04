package com.adam.test;

public class BusyStudent {
    public static void main(String[] args) {
        int[] startTime = new int[]{9,8,7,6,5,4,3,2,1};
        int[] endTime = new int[]{10,10,10,10,10,10,10,10,10};
        int queryTime = 5;
        Solution solution = new Solution();
        System.out.println(solution.busyStudent(startTime, endTime, queryTime));
    }

    static class Solution {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            int total = 0;
            for(int i = 0; i < startTime.length; i++){
                if(queryTime >= startTime[i] && queryTime <= endTime[i]){
                    total++;
                }
            }
            return total;
        }
    }
}
