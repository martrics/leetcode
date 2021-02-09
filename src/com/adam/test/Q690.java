package com.adam.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/2/5 16:19
 * version: 1.0.0
 */
public class Q690 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        employee1.subordinates = Arrays.asList(2, 3);
        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;
        employee2.subordinates = Arrays.asList();
        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;
        employee3.subordinates = Arrays.asList();
        Solution solution = new Solution();
        System.out.println(solution.getImportance(Arrays.asList(employee1, employee2, employee3), 1));
    }

    static class Solution{
        private Map<Integer, Employee> map;
        private int sum = 0;

        public int getImportance(List<Employee> employees, int id) {
            map = new HashMap<>();
            for(Employee employee : employees){
                map.put(employee.id, employee);
            }
            count(id);
            return sum;
        }

        private void count(int id){
            sum += map.get(id).importance;
            List<Integer> list = map.get(id).subordinates;
            if(list != null) {
                for (int val : list) {
                    count(val);
                }
            }
        }
    }

    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };
}
