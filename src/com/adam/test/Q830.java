package com.adam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 9:22
 * version: 1.0.0
 */
public class Q830 {
    public static void main(String[] args) {
        String s = "abbxxxxzzy";
        Solution solution = new Solution();
        List<List<Integer>> list = solution.largeGroupPositions(s);
        for(List<Integer> arr : list){
            System.out.println(arr.get(0) + "    " + arr.get(1));
        }
    }

    static class Solution{
        public List<List<Integer>> largeGroupPositions(String s) {
            List<List<Integer>> list = new ArrayList<>();
            char[] arr = s.toCharArray();
            int start = 0;
            int end = 0;
            int count = 0;
            char c = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(c == arr[i]){
                    count++;
                }else{
                    if(count >= 3){
                        list.add(Arrays.asList(start, end));
                    }
                    start = i;
                    count = 1;
                    c = arr[i];
                }
                end = i;
            }
            if(count >= 3){
                list.add(Arrays.asList(start, end));
            }
            return list;
        }
    }
}
