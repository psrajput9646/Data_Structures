package com.ArraysFiles;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] dd=firstSecond(myArray);
        System.out.println(Arrays.toString(dd));
    }
    public static int[] firstSecond(int[] myArray) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
          System.out.println(myArray[i]);
        }
        for (int score : myArray) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }
}

