package com.apurva.crackingcode.linkedlists;

public class Node {
    int data;
    Node next = null;

    public Node(int d){
        data = d;
    }

    void addNewNodeToEnd(int d){
        Node newNode = new Node(d);
        Node currentNode = this;
        while(currentNode.next!= null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    void printLinkedList(){
       int i=0;
       Node n = this;
       while(n != null){
           System.out.println(i +"th element:" + n.data);
           i++;
           n= n.next;
       }
    }
}
