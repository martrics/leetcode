package com.adam.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/1 15:22
 * version: 1.0.0
 */
public class Q599 {
    public static void main(String[] args) {
        String[] list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = new String[]{"KFC", "Shogun", "Burger King"};
        Solution solution = new Solution();
        String[] ans = solution.findRestaurant(list1, list2);
        for(String str : ans){
            System.out.print(str + "\t");
        }
    }

    static class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            List<String> list = new ArrayList<>();
            if(list1 == null || list2 == null || list1.length == 0 || list2.length == 0){
                return new String[0];
            }
            int minIndex = Integer.MAX_VALUE;
            Map<String, Integer> map = new HashMap<>();
            for(int i = 0; i < list1.length; i++){
                map.put(list1[i], i);
            }
            for(int i = 0; i < list2.length; i++){
                Integer index1 = map.get(list2[i]);
                if(index1 != null){
                    if(index1 + i < minIndex){
                        minIndex = index1 + i;
                        list.clear();
                        list.add(list2[i]);
                    }else if(index1 + i == minIndex){
                        list.add(list2[i]);
                    }
                }
            }
            return list.toArray(new String[0]);
        }
    }
}
