package com.apurva.datastructures.circularLinkedList;

public class Node {
    private int data;
    private Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return  this.data;
    }
    public void setData(int data){
        this.data = data;
    }

    public Node next() { return next; }
    public void setNext(Node n) { next = n; }
}
