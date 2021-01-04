package com.adam.test;

public class DefangIPaddr {
    public static void main(String[] args){
        String address = "1.1.1.1";
        Solution solution = new Solution();
        System.out.println(solution.defangIPaddr(address));
    }

    static class Solution {
        public String defangIPaddr(String address) {
             return address.replace(".", "[.]");
        }
    }
}
