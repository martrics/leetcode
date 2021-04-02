package com.adam.test;

import java.util.List;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/30 9:17
 * version: 1.0.0
 */
public class Q74 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1}, {10}, {23}};
        int target = 12;
        Solution solution = new Solution();
        System.out.println(solution.searchMatrix(matrix, target));
    }

    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length - 1;
            int n = matrix[0].length - 1;
            if(target < matrix[0][0] || target > matrix[m][n]){
                return false;
            }
            if(target > matrix[m][0]){
                return binarySearch(matrix[m], target);
            }else{
                int i = 0;
                for(; i <= m; i++){
                    if(matrix[i][0] == target){
                        return true;
                    }else if(matrix[i][0] > target){
                        break;
                    }
                }
                return binarySearch(matrix[i - 1], target);
            }
        }

        private boolean binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;
            while (low < high) {
                int mid = (high - low) / 2 + low;
                if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return arr[low] == target;
        }
    }
}
