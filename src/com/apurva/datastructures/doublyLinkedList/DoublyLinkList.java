package com.apurva.datastructures.doublyLinkedList;

public class DoublyLinkList {
    Node head;

    public DoublyLinkList(){
        head = null;
    }

    public void insert(int data){
        if(head!=null){
            Node tempNode = head;
            while(tempNode.next!=null){
                tempNode = tempNode.next;
            }
            Node newNode = new Node(data);
            tempNode.setNext(newNode);
            newNode.setPrev(tempNode);
        }
        else{
            head = new Node(data);
        }

    }

    public void delete(){

    }

    public void insertLast(){

    }

    public void deleteLast(){

    }

    public void insertAfter(){

    }

    public void display(){
        if(head!=null){
            Node tempNode = head;
            while(tempNode!=null){
                System.out.print(tempNode.getData());
                if(tempNode.next!=null)
                    System.out.print("->");
                tempNode = tempNode.next;
            }
        }
        else{
            System.out.println("The linked lis empty");
        }
    }

    public void displayReverse(){
        if(head!=null){
        }
        else{
            System.out.println("The linked lis empty");
        }
    }
}
