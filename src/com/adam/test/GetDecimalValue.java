package com.adam.test;

public class GetDecimalValue {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        Solution solution = new Solution();
        System.out.println(solution.getDecimalValue(node1));
    }

    static class Solution{
        public int getDecimalValue(ListNode head) {
            int result = 0;
            ListNode node = head;
            while(node != null){
                result = result << 1;
                result += node.val;
                node = node.next;
            }
            return result;
        }
    }
}
