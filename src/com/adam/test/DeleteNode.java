package com.adam.test;

public class DeleteNode {

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printList(node1);

        Solution solution = new Solution();
        solution.deleteNode(node3);

        printList(node1);
    }

    private static void printList(ListNode node){
        ListNode head = node;
        while(head.next != null){
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(head.val);
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    static class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
