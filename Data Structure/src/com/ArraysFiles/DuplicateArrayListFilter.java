package com.ArraysFiles;

import java.util.Arrays;

public class DuplicateArrayListFilter {

    public static void main (String[] args) {
        int[] removeDuplicates={1,3,1, 2, 2, 3, 4, 5};
        int remove[]=removeDuplicates(removeDuplicates);
        System.out.println(Arrays.toString(remove));
    }
    public static int[] removeDuplicates(int[] arr) {
          int add[]=new int[arr.length];
          int index=0;
        for (int i=0;i< arr.length ;i++ ){
            boolean isDuplicate=false;
            for (int j=i+1;j<arr.length ;j++ ){
                if (arr[i]==arr[j]){
                  isDuplicate=true;
                  break;
                }
            }
            if (!isDuplicate){
                add[index++]=arr[i];
            }
        }
return Arrays.copyOf(add,index);
    }
}
