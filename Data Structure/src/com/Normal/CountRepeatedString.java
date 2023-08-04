package com.Normal;

import java.util.Map;

import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map.Entry;

public class CountRepeatedString {
    public static void main(String[] args) {
        secondWays();
    }


  public   void  firstWayShortcut(){
        // given input string
        String input = "JavaJavaEE";

        // convert string into stream
        Map < Character, Long > result = input
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });
    }

  public static void secondWays(){
        // given input string
        String input = "JavaJavaEE";

        // create a HashMap
        Map < Character, Integer > countDuplicateMap = new HashMap < > ();

        // Converts this string to a new character array.
        char[] charArray = input.toCharArray();

        for (char c: charArray) {

            if (countDuplicateMap.containsKey(c)) {

                // get value by key and increment it's value by a
                countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
            } else {
                countDuplicateMap.put(c, 1);
            }
        }


        for (Entry < Character, Integer > entry: countDuplicateMap.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
