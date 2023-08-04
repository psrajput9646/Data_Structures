package com.Normal;

public class WithoutLoopIteration {
   static void forIteration(int n){
        int m=0;
        while (m<n){
            m= m+1;
            System.out.println(m);
        }

    }
    public static void main(String[] args) {
        forIteration(100);
    }
}
