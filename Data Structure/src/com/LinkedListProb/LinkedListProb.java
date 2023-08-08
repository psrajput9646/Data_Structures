package com.LinkedListProb;

public class LinkedListProb {
    public static void main (String[] args) {
        LinkedListclass LLC=new LinkedListclass();
        LLC.createSingleNode(1);
        LLC.insertNode(2);
        LLC.insertNode(1);
        LLC.insertNode(3);
        LLC.insertNode(5);
        LLC.insertNode(3);
        LLC.traverseSLL();
    }
}
class LinkedListclass{
   public Node head;
    public Node tail;
    int size ;
    public Node createSingleNode(int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        head=newNode;
        tail=newNode;
        size=1;
        return head;

    }

    public void insertNode(int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void deleteDups(){
        Node tempNode=head;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
             if (tempNode.value==tempNode.next.value){
                 
             }
             tempNode=tempNode.next;
            }
        }
    }

    public void traverseSLL(){
        Node tempNode=head;
        for (int i=0;i<size ;i++ ){
            System.out.print(tempNode.value);
            if (i<size-1){
                System.out.print("->");
            }
            tempNode=tempNode.next;
        }
    }
}

class Node{
   public int value;
   public Node next;
}
