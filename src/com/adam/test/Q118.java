package com.adam.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 16:18
 * version: 1.0.0
 */
public class Q118 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> resultList = solution.generate(5);
        for(List<Integer> list : resultList){
            for(int val : list){
                System.out.print(val + "\t");
            }
            System.out.print("\n");
        }
    }

    static class Solution{
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> resultList = new ArrayList<>();
            for(int i = 0; i < numRows; i++){
                List<Integer> list = new ArrayList<>();
                if(i == 0){
                    list = Arrays.asList(1);
                }else if(i == 1){
                    list = Arrays.asList(1, 1);
                }else {
                    List<Integer> upperList = resultList.get(i - 1);
                    list.add(1);
                    for(int j = 0; j < upperList.size() - 1; j++){
                        list.add(j + 1, upperList.get(j) + upperList.get(j + 1));
                    }
                    list.add(1);
                }
                resultList.add(list);
            }
            return resultList;
        }
    }
}
