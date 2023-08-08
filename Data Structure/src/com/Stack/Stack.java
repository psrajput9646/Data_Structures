package com.Stack;

public class Stack {
  public int[] arr;
  public  int topStack;

    public Stack(int size){
        this.arr=new int[size];
        this.topStack=-1;
        System.out.println("This stack created size of of "+size);
    }

}
