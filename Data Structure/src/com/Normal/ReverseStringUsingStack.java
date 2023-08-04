package com.Normal;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your reverse string");
        String st=scanner.nextLine();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            stack.push(st.charAt(i));
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
