package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/29 17:38
 * version: 1.0.0
 */
public class Q203 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
        int val = 6;
        Solution solution = new Solution();
        ListNode node = solution.removeElements(node1, val);
        while(node != null){
            System.out.println(node.val + "\t");
            node = node.next;
        }
    }

    static class Solution{
        public ListNode removeElements(ListNode head, int val) {
            if(head == null){
                return head;
            }
            ListNode dummyHead = new ListNode(-1);
            dummyHead.next = head;
            ListNode pre = dummyHead;
            ListNode node = pre.next;
            while(node != null){
                if(node.val == val){
                    node = node.next;
                }else{
                    pre.next = node;
                    pre = node;
                    node = node.next;
                }
            }
            pre.next = null;

            return dummyHead.next;
        }
    }
}
