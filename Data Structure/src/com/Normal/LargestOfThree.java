package com.Normal;

public class LargestOfThree {
    public static void main(String[] args) {
        int a=45;
        int b=74;
        int c=56;
        int result=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(result);
    }
}
