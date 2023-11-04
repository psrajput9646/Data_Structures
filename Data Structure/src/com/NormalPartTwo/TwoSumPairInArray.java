package com.NormalPartTwo;

import kotlin.jvm.Throws;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumPairInArray {
    public static void main(String[] args) {
        int array[] = {2, 7, 11, 15,16};
        int target = 18;
//        int part[] = sumOfTwoPartOne(array, target);
//        int partTwo[] = sumOfTwoPartTwo(array, target);
//        System.out.println("Sum of two part 1 :" + Arrays.toString(part));
//        System.out.println("Sum of two part 2 :" + Arrays.toString(partTwo));
        sumOfTwoPartOne(array, target);
        sumOfTwoPartTwo(array, target);
    }

    private static void sumOfTwoPartTwo(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == (target - array[i])) {
                    //return new int[]{i, j};
                    System.out.println("Sum of two part 1 :" + Arrays.toString(new int[]{i, j}));
                }
            }
        }
      //  throw new IllegalArgumentException("No pair found?");
    }

    private static void sumOfTwoPartOne(int[] array, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            numMap.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int numToFind = target - array[i];
            if (numMap.containsKey(numToFind) && numMap.get(numToFind) > i) {
               // return new int[]{i, numMap.get(numToFind)};
                System.out.println("Sum of two part 2 :" + Arrays.toString(new int[]{i, numMap.get(numToFind)}));
            }
        }
       // throw new IllegalArgumentException("No pair is found?");
    }


}
