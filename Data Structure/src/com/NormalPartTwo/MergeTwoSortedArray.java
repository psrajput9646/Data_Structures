package com.NormalPartTwo;

import java.util.Arrays;
//Time complexity is =O(nlogn)
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int array[] = {1, 5, 6, 7,12};
        int arrayTwo[] = {2, 5, 8, 9, 11};
        int result[] = merge(array, arrayTwo);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int array[], int arrayTwo[]) {
        int len1 = array.length;
        int len2 = arrayTwo.length;
        int sum = len2 + len1;
        int result[] = new int[sum];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {

            if (array[i] < arrayTwo[j]) {
                result[k++] = array[i++];
            }else {
                result[k++]=arrayTwo[j++];
            }
        }

        while (i<len1){
            result[k++] = array[i++];
        }

        while (j<len2){
            result[k++]=arrayTwo[j++];
        }

        return result;
    }
}
