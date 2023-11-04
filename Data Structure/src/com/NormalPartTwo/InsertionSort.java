package com.NormalPartTwo;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]={5,4,2,9,1};
        insertionFun(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ,");
        }
    }


    private static void insertionFun(int[] a) {

        int temp;
        int j;
        for (int i = 1; i < a.length; i++) {
            temp=a[i];
            j=i-1;
            while (j>=0 && temp<a[j]){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
    }
}
