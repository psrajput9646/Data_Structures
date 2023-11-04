package com.Normal;

public class SumOfArrayRecursion {
    public static void main(String[] args) {
        int[] arr={5,2,3,8,7,23,25};
        int sum=sumOfArray(arr,arr.length);
        System.out.println(sum);
    }

    private static int sumOfArray(int[] arr, int length) {

        if (length<=0){
            return 0;
        }
        return sumOfArray(arr,length-1)+arr[length-1];
    }
}
