package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/18 9:09
 * version: 1.0.0
 */
public class Q92 {
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
        int left = 1;
        int right = 5;
        Solution solution = new Solution();
        ListNode node = solution.reverseBetween(node1, left, right);
        while(node != null){
            System.out.print(node.val + "\t");
            node = node.next;
        }
    }

    static class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(head == null || head.next == null){
                return head;
            }
            if(left == right){
                return head;
            }
            ListNode dummyHead = new ListNode(-1);
            dummyHead.next = head;
            ListNode pre = dummyHead;
            ListNode pos = dummyHead;
            for(int i = 0; i < left - 1; i++){
                pre = pre.next;
            }
            for(int i = 0; i <= right; i++){
                pos = pos.next;
            }
            ListNode cur = pre.next;
            ListNode next = cur.next;
            cur.next = pos;
            while(next != pos){
                ListNode node = next.next;
                next.next = cur;
                cur = next;
                next = node;
            }
            pre.next = cur;
            return dummyHead.next;
        }
    }
}
