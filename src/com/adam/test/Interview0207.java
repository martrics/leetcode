package com.adam.test;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/14 15:03
 * version: 1.0.0
 */
public class Interview0207 {
    public static void main(String[] args) {

    }

    static class Solution{
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null){
                return null;
            }
            int m = 1;
            int n = 1;
            ListNode node1 = headA;
            ListNode node2 = headB;
            while(node1.next != null){
                node1 = node1.next;
                m++;
            }
            while(node2.next != null){
                node2 = node2.next;
                n++;
            }
            if(node1 != node2){
                return null;
            }else{
                node1 = headA;
                node2 = headB;
                int k = m - n;
                if(k > 0){
                    while(k > 0){
                        node1 = node1.next;
                        k--;
                    }
                }else if(k < 0){
                    k = -k;
                    while(k > 0){
                        node2 = node2.next;
                        k--;
                    }
                }
                while(node1 != node2){
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }
        }
    }
}
