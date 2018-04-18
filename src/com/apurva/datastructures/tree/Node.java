package com.apurva.datastructures.tree;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data){
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node left(){
        return leftChild;
    }

    public Node right(){
        return rightChild;
    }

    public void setLeftChild(Node left){
        leftChild = left;
    }

    public void setRightChild(Node right){
        rightChild = right;
    }
}
