package com.DoubleLL;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
    doubleLinkedList.createDLL(6);
        doubleLinkedList.insertDLL(0,7);
        doubleLinkedList.insertDLL(1,8);
        doubleLinkedList.insertDLL(2,9);
        System.out.println(doubleLinkedList.head.next.value);
        doubleLinkedList.traverseDLL();
        doubleLinkedList.reverseTraverseDLL();
        doubleLinkedList.searchNode(9);
        doubleLinkedList.deleteNodeDLL(1);
        doubleLinkedList.traverseDLL();
        doubleLinkedList.deleteAllDLL();
        doubleLinkedList.traverseDLL();
    }
}
