package com.Normal;

public class CountNoOfWord {
    public static void main(String[] args) {
        String str = "Java  Programming question";
        countWords(str);
        System.out.println(str.split("\\s+").length);
    }

    private static void countWords(String str) {
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1 && str.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}
