package com.adam.test;

/**
 * @author: adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/27 21:18
 * version: 1.0.0
 */
public class Q61 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        int k = 4;
        Solution solution = new Solution();
        ListNode node = solution.rotateRight(node1, k);
        while(node != null){
            System.out.print(node.val + "\t");
            node = node.next;
        }
    }

    static class Solution{
        public ListNode rotateRight(ListNode head, int k) {
            if(head == null || head.next == null || k == 0){
                return head;
            }
            int n = 0;
            ListNode node = head;
            while(node.next != null){
                n++;
                node = node.next;
            }
            k = k % (n + 1);
            node.next = head;
            for(int i = 1; i < n + 1 - k; i++){
                head = head.next;
            }
            node = head.next;
            head.next = null;
            return node;
        }
    }
}
