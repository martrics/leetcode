package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/1 12:05
 * version: 1.0.0
 */
public class Q83 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(3);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;

        Solution solution = new Solution();
        ListNode node = solution.deleteDuplicates(node1);
        while(node != null){
            System.out.print(node.val + "\t");
            node = node.next;
        }

    }

    static class Solution{
        public ListNode deleteDuplicates(ListNode head) {
            ListNode node = head;
            if(head == null){
                return head;
            }
            ListNode next = head.next;
            while(next != null){
                while(next != null && head.val == next.val){
                    next = next.next;
                }
                head.next = next;
                head = next;
                if(head != null){
                    next = head.next;
                }
            }
            return node;
        }
    }
}
