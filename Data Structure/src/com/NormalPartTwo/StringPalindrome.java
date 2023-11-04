package com.NormalPartTwo;

public class StringPalindrome {
    public static void main(String[] args) {
        String name="nitin";
        boolean isPalindrome=true;
        int start=0;
        int end=name.length()-1;

        while (start<end){
            if (name.charAt(start)!=name.charAt(end)){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome){
            System.out.println("This is Palindrome :"+name);
        }else {
            System.out.println("This is not  Palindrome :"+name);
        }

    }
}
