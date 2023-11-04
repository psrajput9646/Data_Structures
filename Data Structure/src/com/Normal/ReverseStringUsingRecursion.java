package com.Normal;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String str = "Object";
        String revers = reverseFun(str);
        System.out.println(revers);
    }

    private static String reverseFun(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseFun(str.substring(1) )+ str.charAt(0);
    }
}
