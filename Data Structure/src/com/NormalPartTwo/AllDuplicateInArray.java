package com.NormalPartTwo;

import java.util.*;

public class AllDuplicateInArray {
    public static void main(String[] args) {
        int array[] = {2, 5, 3, 1, 8, 7, 5, 3, 2};
        findDuplicateUsingBruteForce(array);
        findDuplicateUsingSet(array);
        findDuplicateUsingMap(array);
    }
    //Time Complexity O(n)
    private static void findDuplicateUsingMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        map.forEach((k,v) ->{
            if (v>1){
                System.out.println("Duplicate 1 :"+k);
            }
        });
    }
//Time Complexity O(n)
    private static void findDuplicateUsingSet(int[] array) {
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])){
                System.out.println("Duplicate 2 :"+array[i]);
            }else {
              set.add(array[i]);
            }
        }
    }
    //Time Complexity O(n*n)
    private static void findDuplicateUsingBruteForce(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
               if (array[i]==array[j]){
                   System.out.println("Duplicate 3 :"+array[i]);
                   break;
               }
            }
        }
    }
}
