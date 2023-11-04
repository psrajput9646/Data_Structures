package com.NormalPartTwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharInString {

    public static void main(String[] args) {
        String name = "java";
        findDuplicateCharPartOne(name);
        findDuplicateCharPartTwo(name);
    }

    private static void findDuplicateCharPartTwo(String name) {
        Set set = new HashSet();
        for (int i = 0; i < name.length(); i++) {
            Character ch = name.charAt(i);
            if (set.contains(ch)) {
                System.out.println("Duplicate2 :" + ch);
            } else {
                set.add(ch);
            }
        }
    }

    private static void findDuplicateCharPartOne(String name) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            Character ch = name.charAt(i);
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }

        hashMap.forEach((k, v) -> {
            if (v > 1) {
                System.out.println("Duplicate1 :" +k);
            }
        });
    }

}
