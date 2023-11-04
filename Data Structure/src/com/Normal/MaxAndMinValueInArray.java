package com.Normal;

public class MaxAndMinValueInArray {
    public static void main(String[] args) {
        int[] arr={20,2,23,25,12,14,16,1};
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min :"+min+"  max : "+max);
    }
}
