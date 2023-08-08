package com.Normal;

public class Palindrom {
    public static void main(String[] args) {
        String name="nitin";
        boolean status=true;
        int start=0;
        int end=name.length()-1;
        while (start<end){
            if (name.charAt(start)!=name.charAt(end)){
             status=false;
             break;
            }

            start++;
            end--;
        }

        if (status){
            System.out.println("This is palindrom");
        }else {
            System.out.println("This is not palindrom");
        }
    }
}
