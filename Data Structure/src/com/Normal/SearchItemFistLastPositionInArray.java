package com.Normal;

public class SearchItemFistLastPositionInArray {
    public static void main(String[] args) {
        //sorted array
        int[] arr={1,4,7,8,8,11,11,11,11,12,13};
        int search=11;
        int firstIndex=-1;
        int lastIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==search && firstIndex==-1){
                firstIndex=i;
            }
            if (arr[i]==search && firstIndex!=-1){
                lastIndex=i;
            }
        }

        System.out.println("firstIndex : "+firstIndex+" lastIndex :"+lastIndex);
    }
}
