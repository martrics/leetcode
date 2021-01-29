package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/22 14:57
 * version: 1.0.0
 */
public class Q21 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        Solution solution = new Solution();
        ListNode node = solution.mergeTwoLists(node1, node4);
        while(node != null){
            System.out.print(node.val + "\t");
            node = node.next;
        }
    }

    static class Solution{
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null){
                return l2;
            }
            if(l2 == null){
                return l1;
            }
            ListNode dummyHead = new ListNode(0);
            if(l1.val > l2.val){
                dummyHead.next = l2;
                l2 = l2.next;
            }else{
                dummyHead.next = l1;
                l1 = l1.next;
            }
            ListNode curNode = dummyHead.next;
            while(l1 != null && l2 != null){
                if(l1.val > l2.val){
                    curNode.next = l2;
                    curNode = l2;
                    l2 = l2.next;
                }else{
                    curNode.next = l1;
                    curNode = l1;
                    l1 = l1.next;
                }
            }
            if(l1 != null){
                curNode.next = l1;
            }else{
                curNode.next = l2;
            }
            return dummyHead.next;
        }
    }
}
