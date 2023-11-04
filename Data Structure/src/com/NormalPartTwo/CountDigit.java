package com.NormalPartTwo;

public class CountDigit {
    public static void main(String[] args) {
        int digit=45699;
        int count =getDigitCount(digit);
        int countPart=getDigitCountPartTwo(digit);
        System.out.println("Digit count2 :"+countPart);
    }

    private static int getDigitCountPartTwo(int digit) {
        int count=0;
        while (digit>0){
            count++;
            digit=digit/10;
        }
            return count;
    }

    private static int getDigitCount(int digit) {
        if (digit==0){
            return 0;
        }
        return 1+getDigitCount(digit/10);

    }
}
