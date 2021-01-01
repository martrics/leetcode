package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/28 22:29
 * version: 1.0.0
 */
public class Q1700 {
    public static void main(String[] args) {
        int[] students = new int[]{1, 1, 0, 0};
        int[] sandwiches = new int[]{0, 1, 0, 1};
        Solution solution = new Solution();
        System.out.println(solution.countStudents(students, sandwiches));
    }

    static class Solution {
        public int countStudents(int[] students, int[] sandwiches) {
            int oneCount = 0;
            for(int student: students){
                oneCount += student;
            }
            int zeroCount = students.length - oneCount;

            int total = 0;
            for(int sandwich : sandwiches){
                if(sandwich == 1 && oneCount > 0){
                    total++;
                    oneCount--;
                }else if(sandwich == 0 && zeroCount > 0){
                    total++;
                    zeroCount--;
                }else{
                    break;
                }
            }
            return students.length - total;
        }
    }
}
