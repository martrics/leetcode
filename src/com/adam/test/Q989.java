package com.adam.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/22 9:17
 * version: 1.0.0
 */
public class Q989 {
    public static void main(String[] args) {
        int[] A = new int[]{9,9,9,9,9,9,9,9,9,9};
        int K = 1;
        Solution solution = new Solution();
        List<Integer> list = solution.addToArrayForm(A, K);
        for(int val : list){
            System.out.print(val);
        }
        System.out.print("\n");
    }

    static class Solution{
        public List<Integer> addToArrayForm(int[] A, int K) {
            String k = String.valueOf(K);
            char[] B = k.toCharArray();
            int lenA = A.length;
            int lenB = B.length;
            int len = Math.max(lenA, lenB);
            List<Integer> list = new ArrayList<>();
            int carry = 0;
            for(int i = 1; i <= len; i++){
                int valA = lenA - i >= 0? A[lenA -i] : 0;
                int valB = lenB - i >= 0? B[lenB - i] - '0' : 0;
                int val = valA + valB + carry;
                if(val > 9){
                    carry = 1;
                    val = val - 10;
                }else{
                    carry = 0;
                }
                list.add(val);
            }
            if(carry > 0){
                list.add(carry);
            }
            Collections.reverse(list);
            return list;
        }
    }
}
