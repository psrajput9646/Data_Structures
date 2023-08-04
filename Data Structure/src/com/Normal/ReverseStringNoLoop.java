package com.Normal;

import java.util.Scanner;

public class ReverseStringNoLoop {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        s=sc.nextLine();                    //reading string from user
        System.out.print("After reverse string is: ");
        for(int i=s.length();i>0;--i)                //i is the length of the string
        {
            System.out.print(s.charAt(i-1));            //printing the character at index i-1
        }

        //reverse string word by word not end to start
        String[] words=s.split(" ");
        String revString="";
        for (int i = 0; i < words.length; i++) {
            String s1=words[i];
            String revWord="";
            for (int j = s1.length()-1; j >=0; j--) {
            revWord=revWord+s1.charAt(j);
            }
            revString=revString+revWord+" ";
        }
        System.out.println();
        System.out.println(revString);
    }
}
