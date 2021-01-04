package com.adam.test;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args){
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;

        Solution solution = new Solution();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        for(Boolean bool : result){
            System.out.println(bool);
        }
    }

    static class Solution{
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = candies[0];
            for(int val : candies){
                if(val > max){
                    max = val;
                }
            }

            List<Boolean> result = new ArrayList<>(candies.length);
            for(int val : candies){
                if(val + extraCandies >= max){
                    result.add(true);
                }else{
                    result.add(false);
                }
            }
            return result;
        }
    }
}
