package com.Normal;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,5,10,3,4,6,7,8};
        sortUsingBubbleSort(arr);
        normalSortArray(arr);

    }

    private static void normalSortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }
    }

    //bobble sort
    private static void sortUsingBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }
    }
}

