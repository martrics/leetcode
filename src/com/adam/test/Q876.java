package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/8 14:52
 * version: 1.0.0
 */
public class Q876 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution solution = new Solution();
        ListNode node = solution.middleNode(node1);
        System.out.println(node.val);
    }

    static class Solution{
        public ListNode middleNode(ListNode head) {
            ListNode nodeSlow = head;
            ListNode nodeFast = head;
            while(true){
                if(nodeFast == null || nodeFast.next == null){
                    return nodeSlow;
                }else{
                    nodeFast = nodeFast.next.next;
                    nodeSlow = nodeSlow.next;
                }
            }
        }
    }
}
