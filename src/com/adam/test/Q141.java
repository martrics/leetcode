package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/9 18:43
 * version: 1.0.0
 */
public class Q141 {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean hasCycle(ListNode head) {
            if(head == null){
                return false;
            }
            ListNode fast = head;
            ListNode slow = head;
            do{
                if(slow.next != null){
                    slow = slow.next;
                }else{
                    return false;
                }
                if(fast.next != null && fast.next.next != null){
                    fast = fast.next.next;
                }else{
                    return false;
                }
            }while(fast != slow);

            return true;
        }
    }
}
