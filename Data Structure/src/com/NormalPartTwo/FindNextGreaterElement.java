package com.NormalPartTwo;

import java.util.Stack;

public class FindNextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {-1, 7, 8, 101, 12, 9, 10};
        nextGreaterElement(arr);
    }

    private static void nextGreaterElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (stack.isEmpty()) {
                stack.push(arr[i]);
                System.out.println("Empty first item : "+arr[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() < arr[i]) {
                    System.out.println("Next greater element of " + stack.peek() + " is " + arr[i]);
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.push(arr[i]);
                }
            }

        }
        while (!stack.isEmpty()) {
            System.out.println("Next greater element of " + stack.peek());
            stack.pop();
        }
    }
}
