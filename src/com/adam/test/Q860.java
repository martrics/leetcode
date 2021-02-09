package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/8 14:55
 * version: 1.0.0
 */
public class Q860 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean lemonadeChange(int[] bills) {
            int[] arr = new int[2];
            for(int bill : bills){
                if(bill == 5){
                    arr[0]++;
                }else if(bill == 10){
                    if(arr[0] > 0){
                        arr[0]--;
                        arr[1]++;
                    }else{
                        return false;
                    }
                }else if(bill == 20){
                    if(arr[1] > 0 && arr[0] > 0){
                        arr[1]--;
                        arr[0]--;
                    }else if(arr[1] == 0 && arr[0] > 2){
                        arr[0] -= 3;
                    }else{
                        return false;
                    }
                }

            }
            return true;
        }
    }
}
