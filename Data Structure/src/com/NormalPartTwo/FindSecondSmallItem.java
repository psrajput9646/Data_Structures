package com.NormalPartTwo;

public class FindSecondSmallItem {
    public static void main(String[] args) {
        int arr[] = {-1, 7, 8, 1,-2, -9, 10};
        int result=findSecondSmallItem(arr);
        System.out.println("findSecondSmallItem : "+result);
    }

    private static int findSecondSmallItem(int[] arr) {
        int smallest=Integer.MAX_VALUE;
        int secondSmellest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<smallest){
                secondSmellest=smallest;
                smallest=arr[i];
            }

            if (arr[i]>smallest && arr[i] < secondSmellest){
                secondSmellest=arr[i];
            }
        }
        return secondSmellest;
    }
}
