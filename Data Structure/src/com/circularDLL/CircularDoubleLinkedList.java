package com.circularDLL;

public class CircularDoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size;

    public DoubleNode createCDLL(int nodeValue) {
        head = new DoubleNode();
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.pre = newNode;
        size = 1;
        return head;
    }

    public void insertNode(int nodeValue, int location) {
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        if (head == null) {
            createCDLL(location);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.pre = tail;
            head.pre = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.pre = tail;
            head.pre = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            newNode.pre = tempNode;
            newNode.next.pre = newNode;
            tempNode.next = newNode;
        }
        size++;
    }

    public void traverseCDLL() {
        DoubleNode tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print(" => ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The CDLL does not exits!");
        }
        System.out.println();
    }

    public void reverseTraverseCDLL() {
        DoubleNode tempNode = tail;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print(" => ");
                }
                tempNode = tempNode.pre;
            }
        } else {
            System.out.println("The CDLL does not exits!");
        }
        System.out.println();
    }

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("This node found at location " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println("Node not found!");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CDLL does not exits!");
            return;
        } else if (location == 0) {

            if (size == 1) {
                head.next = null;
                head.pre = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.pre = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head.next = null;
                head.pre = null;
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.pre;
                tail.next = head;
                head.pre = tail;
                size--;
            }
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.pre=tempNode;
            size--;
        }
    }

    public void deleteCDLL(){
        DoubleNode tempNode=head;
        for (int i = 0; i < size; i++) {
           tempNode.pre=null;
           tempNode=tempNode.next;
        }
        head=null;
        tail=null;
        System.out.println("The CDLL has been deleted!");
    }
}
