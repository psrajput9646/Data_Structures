package com.Normal;

import java.util.LinkedList;

public class NPositionLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printNthFromEnd(int n) {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < n)
            return;
        temp = head;
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;
        System.out.println(n + "th node from the end is " + temp.data);
    }

    public void add(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        NPositionLinkedList ll = new NPositionLinkedList();
        ll.add(12);
        ll.add(8);
        ll.add(21);
        ll.add(96);
        ll.add(52);
        ll.add(27);
        ll.add(14);
        ll.printNthFromEnd(2);
    }
}
