package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/25 11:27
 * version: 1.0.0
 */
public class Q82 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        Solution solution = new Solution();
        ListNode node = solution.deleteDuplicates(node1);
        while(node != null){
            System.out.println(node.val + "\t");
            node = node.next;
        }
    }

    static class Solution{
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null){
                return head;
            }
            ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
            dummyHead.next = head;

            ListNode cur = dummyHead;
            while (cur.next != null && cur.next.next != null) {
                if (cur.next.val == cur.next.next.val) {
                    int x = cur.next.val;
                    while (cur.next != null && cur.next.val == x) {
                        cur.next = cur.next.next;
                    }
                } else {
                    cur = cur.next;
                }
            }

            return dummyHead.next;
        }
    }
}
