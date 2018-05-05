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

    public void delete(int data){
        if(head!=null){
            Node tempNode = head;
            while(tempNode.getData()!=data && tempNode!=null) {
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                head = tempNode.next;
            }
            else{
                tempNode.prev.setNext(tempNode.next);
                tempNode.next.setPrev(tempNode.prev);
            }
            tempNode = null;
        }
        else{
            System.out.println("The doubly linked list empty or the node with the data value does not exist");
        }

    }

    public void deleteLast(){
        if(head!=null){
            Node tempNode = head;
            while(tempNode.next!=null){
                tempNode = tempNode.next;
            }
            tempNode.prev.setNext(null);
            tempNode.setPrev(null);
            tempNode = null;
            System.out.println("Last node deleted successfully");
        }
        else{
            System.out.println("The doubly linked list empty");
        }
    }

    public void insertAfter(int data){
        if(head!=null){
            Node tempNode = head;
            if(tempNode.getData()!=data && tempNode!=null){
                tempNode = tempNode.next;
            }
            Node newNode = new Node(data);
            newNode.setPrev(tempNode);
            newNode.setNext(tempNode.next);
            tempNode.setNext(newNode);
        }
        else{
            System.out.println("The doubly linked list empty or the node with the data value does not exist");
        }

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
            System.out.println("The doubly linked list empty");
        }
    }

    public void displayReverse(){
        if(head!=null){
            Node tempNode = head;
            while(tempNode.next!=null) {
                tempNode = tempNode.next;
            }
            while(tempNode!=head){
                System.out.print(tempNode.getData()+"->");
                tempNode = tempNode.prev;
            }
            System.out.print(tempNode.data);
        }
        else{
            System.out.println("The doubly linked list empty");
        }
    }
}
