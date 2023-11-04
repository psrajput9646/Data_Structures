package com.BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap heap =new BinaryHeap(5);
//        heap.insert(10,"Max");
//        heap.insert(5,"Max");
//        heap.insert(15,"Max");
//        heap.insert(1,"Max");
        heap.insert(10,"Min");
        heap.insert(5,"Min");
        heap.insert(15,"Min");
        heap.insert(1,"Min");
        heap.levelOrder();
       // heap.extractHeadOfBP("Max");
        heap.extractHeadOfBP("Min");
        heap.levelOrder();
    }
}
