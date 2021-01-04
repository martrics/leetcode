package com.adam.test;

public class GetKthFromEnd {
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
        Solution solution = new Solution();
        System.out.println(solution.getKthFromEnd(node5, 1).val);
    }

    static class Solution{
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode slow = head;
            ListNode fast = head;
            for(int i = 0; i < k; i++){
                fast = fast.next;
            }
            if(fast == null){
                return slow;
            }
            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
            return slow.next;
        }
    }
}
