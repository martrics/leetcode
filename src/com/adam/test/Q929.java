package com.adam.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/26 15:57
 * version: 1.0.0
 */
public class Q929 {
    public static void main(String[] args) {
        String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Solution solution = new Solution();
        System.out.println(solution.numUniqueEmails(emails));
    }

    static class Solution{
        public int numUniqueEmails(String[] emails) {
            Set<String> set = new HashSet<>();
            for(String email : emails){
                String[] arr = email.split("@");
                String name = arr[0];
                String domain = arr[1];
                name = name.replaceAll("\\.", "");
                if(name.indexOf("+") > 0) {
                    name = name.substring(0, name.indexOf("+"));
                }
                set.add(name + "@" + domain);
            }
            return set.size();
        }
    }
}
