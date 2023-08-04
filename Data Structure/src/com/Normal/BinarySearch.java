package com.Normal;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scanner.nextInt();
        System.out.println("Enter value of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter value for search");
        int num = scanner.nextInt();
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == num) {
                System.out.println("Value is found at index :"+mid);
                break;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            }
        }

        if (low > high) {
            System.out.println("Value is not found in array");
        }

    }
}
