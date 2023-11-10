package com.NormalPartTwo;

public class NumberOfIterator {
    public static void main(String[] args) {
        //output=>// 12345// 51234// 45123// 34512// 23451

        int size = 5;
        int inital = 0;
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 5; i++) {
                if (inital == 0) {
                    System.out.print(" " + (i + 1));
                } else {
                    for (int j = inital; j > 0; j--) {
                        System.out.print(" " + (size + 1 - j));
                    }
                    break;
                }
            }
            int remain = size - inital;
            if (inital > 0) {
                for (int i = 1; i <= remain; i++) {
                    System.out.print(" " + i);
                }
            }
            inital++;

            System.out.println(" ,");

        }
    }
}
