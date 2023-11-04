package com.NormalPartTwo;

public class SumOfN {
    public static void main(String[] args) {
        int sumPartOne=getSumOfOnePart(10);
        int sumPartTwo=getSumOfTwoPart(10);
        int sumPartThree=getSumOfThreePart(10);

        System.out.println("sumPartOne : "+sumPartOne+" ,sumPartTwo : "+sumPartTwo+" , sumPartThree : "+sumPartThree);
    }

    private static int getSumOfThreePart(int i) {
        return (i*(i+1))/2;
    }

    private static int getSumOfTwoPart(int i) {
        if (i==0){
            return 0;
        }
        return i+getSumOfTwoPart(i-1);
    }

    private static int getSumOfOnePart(int i) {
        int sum=0;
        for (int j = 1; j <= i; j++) {
            sum=j+sum;
        }
        return sum;
    }
}
