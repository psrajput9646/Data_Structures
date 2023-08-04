package com.Normal;

public class Factorial {
    public static void main(String[] args) {
    long fact=fact(4);
        System.out.println(fact);
    }
    public static long fact(int n){
        if (n==0){
            return 1;
        }else {
            return n*fact(n-1);
        }
    }
}
