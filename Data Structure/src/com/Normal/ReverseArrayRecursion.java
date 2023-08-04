package com.Normal;

public class ReverseArrayRecursion {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 8, 9};
        reverseArray(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ,");
        }
    }

    private static void reverseArray(int[] arr, int start, int end) {
        //Termination condition
        if (start >= end) {
            return;
        }
        //swap number
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        //recursion call
        reverseArray(arr, start + 1, end - 1);
    }
}
