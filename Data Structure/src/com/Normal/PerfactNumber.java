package com.Normal;

import java.util.Scanner;

public class PerfactNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to check perfect no. ");
        int num=scanner.nextInt();
        int sum=0;
        if (num>0){
            for (int i = 1; i <= num/2; i++) {
              if (num%i==0){
                  sum=sum+i;
              }

            }
        }else {
            System.out.println("Please enter positive number");
        }
        if (sum==num){
            System.out.println("This is perfect number :"+sum);
        }else {
            System.out.println("This is not perfect number :"+num);
        }
    }
}
