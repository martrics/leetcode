package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/22 10:57
 * version: 1.0.0
 */
public class Q412 {
    public static void main(String[] args) {

    }

    static class Solution{
        public List<String> fizzBuzz(int n) {
            List<String> list = new ArrayList<>();
            for(int i = 1; i <=n; i++){
                if(i % 3 == 0 && i % 15 != 0){
                    list.add("Fizz");
                }else if(i % 5 == 0 && i % 15 != 0){
                    list.add("Buzz");
                }else if(i % 15 == 0){
                    list.add("FizzBuzz");
                }else{
                    list.add(String.valueOf(i));
                }
            }
            return list;
        }
    }
}
