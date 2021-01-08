package com.adam.test;

import java.util.*;

/**
 * @author adam
 * contact: luminghi@hotmail.com
 * date: 2021/1/6 11:28
 * version: 1.0.0
 */
public class Q399 {
    public static void main(String[] args) {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("c", "d"));
        double[] values = new double[]{1.0, 1.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "d"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("d", "c"));
        Solution solution = new Solution();
        double[] result = solution.calcEquation(equations, values, queries);
        for(double val : result){
            System.out.println(val + "\t");
        }
    }

    static class Solution{
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            double[] result = new double[queries.size()];
            List<Map<String, Double>> list = new ArrayList<>();
            Set<String> set = new HashSet<>();
            for(int m = 0; m < equations.size(); m++){
                Map<String, Double> map = new HashMap<>();
                if(!set.contains(equations.get(m).get(0))  && !set.contains(equations.get(m).get(1))){
                    map.put(equations.get(m).get(1), 1.0);
                    map.put(equations.get(m).get(0), values[m]);

                    boolean toAdd = true;
                    while(toAdd) {
                        toAdd = false;
                        for (int i = m + 1; i < equations.size(); i++) {
                            List<String> equation = equations.get(i);
                            Double toBeDivided = map.get(equation.get(0));
                            Double divided = map.get(equation.get(1));
                            if (divided == null) {
                                if (toBeDivided == null) {
                                    continue;
                                } else {
                                    divided = toBeDivided / values[i];
                                    map.put(equation.get(1), divided);
                                    toAdd = true;
                                }
                            } else {
                                if (toBeDivided == null) {
                                    map.put(equation.get(0), divided * values[i]);
                                    toAdd = true;
                                }
                            }
                        }
                    }
                }
                list.add(map);
                set.addAll(map.keySet());
            }
            for(int i = 0; i < queries.size(); i++){
                Double toBeDivided = null;
                Double divided = null;
                for(Map<String, Double> map : list) {
                    toBeDivided = map.get(queries.get(i).get(0));
                    divided = map.get(queries.get(i).get(1));
                    if(toBeDivided != null && divided != null){
                        result[i] = toBeDivided / divided;
                        break;
                    }
                }
                if(toBeDivided == null || divided == null){
                    result[i] = -1;
                }
            }
            return result;
        }
    }
}
