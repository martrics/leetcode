package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/4/21 22:16
 * version: 1.0.0
 */
public class LCP29 {
    public static void main(String[] args) {
        int num = 3;
        int Xpos = 0;
        int Ypos = 2;
        Solution solution = new Solution();
        System.out.println(solution.orchestraLayout(num, Xpos, Ypos));
    }

    static class Solution {
        public int orchestraLayout(int num, int xPos, int yPos) {
            long l = Math.min(Math.min(xPos, num - 1 - xPos), Math.min(yPos, num - 1 - yPos));
            long pre = (num * l - l * l) * 4;
            long ans = 0;
            if(xPos == l){
                ans = pre + (yPos - l + 1);
            }else if(num - 1 - yPos == l){
                ans = pre + num - (l * 2) - 1 + (xPos - l + 1);
            }else if(num - 1 - xPos == l){
                ans = pre + (num - (l * 2) - 1) * 2 + (num - l - yPos);
            }else{
                ans = pre + (num - (l * 2) - 1) * 3 + (num - l - xPos);
            }
            return (int) (ans % 9 == 0 ? 9 : ans % 9);
        }
    }
}
