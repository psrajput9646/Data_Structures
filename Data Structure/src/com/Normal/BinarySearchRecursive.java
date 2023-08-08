package com.Normal;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr={10,12,14,15,16,20};
        int search=15;
        int start=0;
        int end= arr.length-1;
        FindArrayElementRecursive(arr,start,end,search);
    }

    private static void FindArrayElementRecursive(int[] arr, int start, int end, int search) {

        if (start>end){
            return;
        }
        int mid=(start+end)/2;
        if (arr[mid]==search){
            System.out.println("Found element in "+mid);
            return;
        }else if (search>arr[mid]){
            FindArrayElementRecursive(arr,mid+1,end,search);
        }else {
            FindArrayElementRecursive(arr,start,mid-1,search);
        }
    }
}
