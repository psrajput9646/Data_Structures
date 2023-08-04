package com.Normal;

public class MatchingCountString {
    public static void main(String[] args) {
        String str1 = "aabcddekll12@";
        String str2 = "bb2211@55k";

        count(str1, str2);
    }

    public static void count(String str1, String str2) {
        int c = 0;
        // Traverse the string 1 char by char
        for (int i = 0; i < str1.length(); i++) {
            if (str2.indexOf(str1.charAt(i)) >= 0) {
                System.out.println("matching characters are: " + str1.charAt(i));
                c += 1;
            }
        }
        System.out.println("No. of matching characters are: " + c);
    }
}
