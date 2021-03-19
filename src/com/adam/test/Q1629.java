package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/25 17:37
 * version: 1.0.0
 */
public class Q1629 {
    public static void main(String[] args) {
        int[] releaseTimes = new int[]{1, 2};
        String keysPressed = "ba";
        Solution solution = new Solution();
        System.out.println(solution.slowestKey(releaseTimes, keysPressed));
    }

    static class Solution {
        public char slowestKey(int[] releaseTimes, String keysPressed) {
            int n = releaseTimes.length;
            int ans = 0;
            int max = releaseTimes[0];
            for (int i = 1; i < n; i++) {
                int time = releaseTimes[i] - releaseTimes[i - 1];
                if (time > max || (time == max && keysPressed.charAt(i) > keysPressed.charAt(ans))) {
                    max = time;
                    ans = i;
                }
            }
            return keysPressed.charAt(ans);
        }
    }
}
