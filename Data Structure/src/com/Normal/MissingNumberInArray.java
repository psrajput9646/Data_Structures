package com.Normal;

public class MissingNumberInArray {
    public static void main(String[] args) {
        //add all array and substact to total sum number
        int arr[]={3,2,1,5,4,9,8,7};
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        for (int i = 0; i < arr.length; i++) {
            sum=sum-arr[i];
        }
        System.out.println("Missing Number is :"+sum);
    }
}
