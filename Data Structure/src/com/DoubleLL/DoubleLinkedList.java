package com.DoubleLL;

public class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size;
    //Create DLL first time
    public DoubleNode createDLL(int nodeValue){
        head= new DoubleNode();
        DoubleNode newNode=new DoubleNode();
        newNode.value=nodeValue;
        newNode.next=null;
        newNode.pre=null;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }

    //Insert one element in DLL
    public void insertDLL(int location, int nodeValue){
        DoubleNode newNode=new DoubleNode();
        newNode.value=nodeValue;
        if (head==null){
            createDLL(nodeValue);
            return;
        } else if (location==0) {
            newNode.next=head;
            newNode.pre=null;
            head.pre=newNode;
            head=newNode;
        } else if (location>=size) {
            newNode.next=null;
            tail.next=newNode;
            newNode.pre=tail;
            tail=newNode;
        }else {
            DoubleNode tempNode=head;
            int index=0;
            while (index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            newNode.pre=tempNode;
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            newNode.next.pre=newNode;
        }
        size++;
    }
    //fetch all object of forward direction in DLL
    public void traverseDLL(){
        if (head!=null){
            DoubleNode tempNode=head;
            for (int i = 0; i <size ; i++) {
                System.out.print(tempNode.value);
                if (i<size-1){
                    System.out.print(" => ");
                }
                tempNode=tempNode.next;
            }

        }else {
            System.out.println("DLL has not exits");
        }
        System.out.println();
    }
    //Fetch all object in reverse order  of DLL
    public void reverseTraverseDLL(){
        if (head!=null){
       DoubleNode doubleNode=tail;
            for (int i = 0; i < size; i++) {
                System.out.print(doubleNode.value);
                if (i<size-1){
                    System.out.print(" => ");
                }
                doubleNode=doubleNode.pre;
            }
        }else {
            System.out.println("DLL has not exits");
        }
        System.out.println();
    }
    //Search one object of DLL
    public boolean searchNode(int nodeValue){
      if (head!=null){
          DoubleNode tempNode=head;
          for (int i = 0; i < size; i++) {
              if (tempNode.value==nodeValue){
                  System.out.println("Node found  position : "+i);
                  return true;
              }
              tempNode=tempNode.next;
          }
      }else {
          System.out.println("Node not found!");
      }


        return false;
    }
    //Delete one object of DLL
    public void deleteNodeDLL(int location){
        if (head==null){
            System.out.println("The DLL does not exits!");
            return;
        } else if (location==0) {
            if (size==1){
                head=null;
                tail=null;
                size--;
            }else {
                head=head.next;
                head.pre=null;
                size--;
            }
        }else if (location>=size){
            DoubleNode tempNode=tail.pre;
            if (size==1){
                head=null;
                tail=null;
                size--;
            }else {
                tempNode.next=null;
                tail=tempNode;
                size--;
            }
        }else {
            DoubleNode tempNode=head;
            for (int i = 0; i < location-1; i++) {
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            tempNode.next.pre=tempNode;
            size--;
        }
    }

    //Delete all object of DLL
    public void deleteAllDLL(){
        DoubleNode tempNode=head;
        for (int i = 0; i < size; i++) {
            tempNode.pre=null;
            tempNode=tempNode.next;
        }
        head=null;
        tail=null;
        System.out.println("The DLL has been deleted!");
    }
}
