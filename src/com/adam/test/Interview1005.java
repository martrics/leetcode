package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/9 16:21
 * version: 1.0.0
 */
public class Interview1005 {
    public static void main(String[] args) {
        String[] words = new String[]{"at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""};
        String s = "ball";
        Solution solution = new Solution();
        System.out.println(solution.findString(words, s));
    }

    static class Solution{
        public int findString(String[] words, String s) {
            int n = words.length;
            int left = 0;
            int right = n - 1;
            while("".equals(words[left])){
                left++;
            }
            while("".equals(words[right])){
                right--;
            }
            while(left <= right){
                int mid = left + (right - left) / 2;
                if("".equals(words[mid])) {
                    while (mid >= 0 && "".equals(words[mid])) {
                        mid--;
                    }
                    if (words[mid].compareTo(s) == 0) {
                        return mid;
                    } else if (words[mid].compareTo(s) > 0) {
                        right = mid;
                    } else {
                        mid = left + (right - left) / 2;
                        while (mid < n && "".equals(words[mid])) {
                            mid++;
                        }
                        left = mid;
                    }
                }else {
                    if (words[mid].compareTo(s) > 0) {
                        right = mid - 1;
                    } else if (words[mid].compareTo(s) < 0) {
                        left = mid + 1;
                    } else {
                        return mid;
                    }
                }
            }
            return -1;
        }
    }
}
