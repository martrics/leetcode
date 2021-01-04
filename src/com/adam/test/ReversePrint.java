package com.adam.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adam
 */
public class ReversePrint {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        Solution solution = new Solution();
        int[] result = solution.reversePrint(node1);
        for(int val : result){
            System.out.print(val + "\t");
        }
    }

    static class Solution {
        public int[] reversePrint(ListNode head) {
            List<Integer> list = new ArrayList<>();
            ListNode node = head;
            while(node != null){
                list.add(node.val);
                node = node.next;
            }
            int[] result = new int[list.size()];
            for(int i = 0; i < result.length; i++){
                result[i] = list.get(result.length - 1 - i);
            }
            return result;
        }
    }
}
