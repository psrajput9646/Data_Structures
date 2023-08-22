package com.NormalPartTwo;

public class DecimalToBinary {
    public static void main(String[] args) {
        int value=5;
        int arr[]=new int[20];
        int count=0;
        while (value>0){
            arr[count++]=value%2;
            value=value/2;
        }

        for (int i = count-1; i >=0 ; i--) {
            System.out.println(arr[i]+" ");
        }
    }
}
