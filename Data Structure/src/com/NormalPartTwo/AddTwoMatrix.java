package com.NormalPartTwo;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int arr1[][] = {{1, 3, 5}, {2, 4, 6}, {3, 6, 7}};
        int arr2[][] = {{3, 2, 1}, {6, 5, 4}, {7, 8, 9}};
        addFun(arr1,arr2,3,3);

    }

    private static void addFun(int[][] arr1, int[][] arr2, int m, int n) {
        int arr3[][]=new int[3][3];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               arr3[i][j]=arr1[i][j] +arr2[i][j];
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( arr3[i][j] +" ");
            }
            System.out.println();
        }
    }

}
