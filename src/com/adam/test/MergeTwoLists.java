package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/5 9:44
 * version: 1.0.0
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;
        Solution solution = new Solution();
        ListNode node = solution.mergeTwoLists(node6, null);
        while(node != null){
            System.out.print(node.val + "\t");
            node = node.next;
        }
    }

    static class Solution{
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode node1 = l1;
            ListNode node2 = l2;
            ListNode head = null;
            ListNode result = null;
            int val1;
            int val2;
            while(node1 != null || node2 != null){
                if(node1  == null){
                    val1 = Integer.MAX_VALUE;
                }else{
                    val1 = node1.val;
                }
                if(node2 == null){
                    val2= Integer.MAX_VALUE;
                }else{
                    val2 = node2.val;
                }
                int val = Math.min(val1, val2);
                if(result == null){
                    result = new ListNode(val);
                    head = result;
                }else {
                    result.next = new ListNode(val);
                    result = result.next;
                }
                if(val1 < val2){
                    node1 = node1.next;
                }else{
                    node2 = node2.next;
                }
            }
            return head;
        }
    }
}
