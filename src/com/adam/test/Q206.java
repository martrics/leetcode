package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/7 17:23
 * version: 1.0.0
 */
public class Q206 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Solution solution = new Solution();
        ListNode newHead = solution.reverseList(node1);
        while(newHead != null){
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

    static class Solution{
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode node = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return node;
        }
    }
}
