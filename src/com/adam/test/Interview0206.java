package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/3/29 9:21
 * version: 1.0.0
 */
public class Interview0206 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(node1));
    }

    static class Solution{
        public boolean isPalindrome(ListNode head) {
            if(head == null || head.next == null){
                return true;
            }
            int n = 0;
            ListNode node = head;
            while(node != null){
                node = node.next;
                n++;
            }
            int m = n / 2;
            node = head;
            while(m > 1){
                node = node.next;
                m--;
            }
            ListNode right = node.next;
            node.next = null;
            node = reverseList(head);
            if(n % 2 != 0){
                right = right.next;
            }
            while(right != null && node != null){
                if(right.val != node.val){
                    return false;
                }
                right = right.next;
                node = node.next;
            }

            return true;
        }

        private ListNode reverseList(ListNode head) {
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
