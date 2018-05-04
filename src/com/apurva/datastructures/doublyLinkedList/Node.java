package com.apurva.datastructures.doublyLinkedList;

public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int dataIn) {
        data = dataIn;
        next = null;
        prev = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int dataIn){
        data =  dataIn;
    }

    public Node getNext(){
        return  next;
    }

    public Node getPrev(){
        return  prev;
    }

    public void setNext(Node nextIn){
        next = nextIn;
    }

    public void setPrev(Node prevIn){
        prev = prevIn;
    }
}

