package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2020/12/31 11:01
 * version: 1.0.0
 */
public class Q728 {
    public static void main(String[] args) {
        int left = 3056;
        int right = 4813;
        Solution solution = new Solution();
        List<Integer> result = solution.selfDividingNumbers(left, right);
        for (int val : result) {
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> list = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                if (isSelfDividingNumber(i)) {
                    list.add(i);
                }
            }
            return list;
        }

        private boolean isSelfDividingNumber(int n) {
            if (n < 10) {
                return true;
            } else if (n > 10 && n <= 99) {
                int ten = n / 10;
                int one = n - ten * 10;
                if(one != 0 && n % ten == 0 && n % one == 0){
                    return true;
                }
            } else if (n > 100 && n <= 999) {
                int hundred = n / 100;
                int ten = (n - 100 * hundred) / 10;
                int one = n - 100 * hundred - 10 * ten;
                if(ten != 0 && one != 0){
                    if(n % hundred == 0 && n % ten == 0 && n % one == 0){
                        return true;
                    }
                }
            } else if (n > 1000 && n <= 9999) {
                int thousand = n / 1000;
                int hundred = (n - 1000 * thousand) / 100;
                int ten = (n - 1000 * thousand - 100 * hundred) / 10;
                int one = n - 1000 * thousand - 100 * hundred - 10 * ten;
                if(hundred !=0 && ten != 0 && one != 0){
                    if(n % thousand == 0 && n % hundred == 0 && n % ten == 0 && n % one == 0){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
