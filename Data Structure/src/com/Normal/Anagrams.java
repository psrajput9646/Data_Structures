package com.Normal;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two string in different variable");
        String nameone=scanner.nextLine();
        String nametwo=scanner.nextLine();
        char arrone[]=nameone.toCharArray();
        char arrtwo[]=nametwo.toCharArray();
        Arrays.sort(arrone);
        Arrays.sort(arrtwo);

        String st1=new String(arrone);
        String st2=new String(arrtwo);
        if (st1.equals(st2)){
            System.out.println("This is anagram");
        }else {
            System.out.println("This is not anagram");
        }

        boolean isAnagram=isAnagram(nameone,nametwo);
        System.out.println("This is anagram :"+isAnagram);
    }
    public static boolean isAnagram(String st1,String st2){
        if (st1.length()!=st2.length()){
            return false;
        }
        int countarr[]=new int[256];
        for (int i = 0; i < st1.length(); i++) {
            countarr[st1.charAt(i)]++;
            countarr[st2.charAt(i)]--;
        }
        for (int i = 0; i <countarr.length ; i++) {
            if (countarr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
