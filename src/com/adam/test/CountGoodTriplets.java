package com.adam.test;

public class CountGoodTriplets {
    public static void main(String[] args) {
        int[] arr = new int[]{3,0,1,1,9,7};
        int a = 7;
        int b = 2;
        int c = 3;
        Solution solution = new Solution();
        System.out.println(solution.countGoodTriplets(arr, a, b, c));
    }

    static class Solution{
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int total = 0;
            if(arr.length < 3){
                return 0;
            }
            for(int i = 0; i < arr.length - 2; i++){
                for(int j = i + 1; j < arr.length - 1; j++){
                    for(int k = j + 1; k < arr.length; k++){
                        if((Math.abs(arr[i] - arr[j]) <= a) && (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)){
                            total++;
                        }
                    }
                }
            }
            return total;
        }
    }
}
