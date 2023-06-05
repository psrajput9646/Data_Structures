package com.circularDLL;

public class Main {
    public static void main(String[] args) {
        CircularDoubleLinkedList CDLL=new CircularDoubleLinkedList();
        CDLL.createCDLL(5);
        System.out.println(CDLL.head.value);
        CDLL.insertNode(6,0);
        CDLL.insertNode(7,2);
        CDLL.insertNode(8,3);
        CDLL.insertNode(9,4);
        CDLL.insertNode(11,5);
        System.out.println(CDLL.head.value);
        CDLL.traverseCDLL();
        CDLL.reverseTraverseCDLL();
        CDLL.searchNode(11);
        CDLL.deleteNode(3);
        CDLL.traverseCDLL();
        CDLL.deleteCDLL();
        CDLL.traverseCDLL();
    }
}
