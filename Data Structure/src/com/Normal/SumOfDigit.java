package com.Normal;

public class SumOfDigit {

    public static void main(String[] args) {
        int n=256;
        int rem=0;
        int sum=0;
        while (n>0){
            rem=n%10;//6
            sum=sum+rem;
            n=n/10;//25
        }

        System.out.println(sum);
    }
}
