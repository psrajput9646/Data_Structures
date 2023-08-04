package com.Normal;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9, 11};
        int[] arr2 = {4, 6, 8, 9, 11,12};
//This logic will work only in sorting case o(m+n)
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
//This will work any case and time complexity is o(n*n)
        for (int k = 0; k < arr1.length; k++) {
            for (int l = 0; l < arr2.length; l++) {
                if (arr1[k]==arr2[l]){
                    System.out.println(arr1[k]);
                }
            }
        }
    }
}
