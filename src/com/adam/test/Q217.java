package com.adam.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/13 14:14
 * version: 1.0.0
 */
public class Q217 {
    public static void main(String[] args) {

    }

    static class Solution{
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int val : nums){
                if(set.contains(val)){
                    return true;
                }else{
                    set.add(val);
                }
            }
            return false;
        }
    }

}
