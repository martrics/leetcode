package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/7 14:26
 * version: 1.0.0
 */
public class Offer18 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Solution solution = new Solution();
        ListNode node = solution.deleteNode(node1, 1);
        while(node != null){
            System.out.print(node.val + "\t");
            node = node.next;
        }
    }

    static class Solution{
        public ListNode deleteNode(ListNode head, int val) {
            if(head == null){
                return null;
            }
            if(head.val == val){
                return head.next;
            }
            ListNode node = head;
            while(node.next != null){
                if(node.next.val == val){
                    node.next = node.next.next;
                    break;
                }
                node = node.next;
            }
            return head;
        }
    }
}
