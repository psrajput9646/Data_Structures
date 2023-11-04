package com.practiceDS.SingleLinkedList;

public class CalculationSLL {
    private Node head;

    public CalculationSLL() {
        this.head = null;
    }

    public Node addItem(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
        }
        return head;
    }

    public boolean itterativeSearch(int value) {
        Node temp = head;
        boolean isMatched = false;
        while (temp != null) {
            if (temp.value == value) {
                isMatched = true;
                break;
            }
            temp = temp.next;
        }
        return isMatched;
    }

    public boolean recursiveSearch(Node head, int value) {
        if (head == null) {
            return false;
        }
        if (head.value == value) {
            return true;
        }
        return recursiveSearch(head.next, value);
    }


    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.value+" ->");
            temp=temp.next;
        }
    }



}
