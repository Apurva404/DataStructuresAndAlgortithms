package com.apurva.datastructures.singlyLinkedList;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }



    public void display() {
        if (head != null) {
            Node cur = head;
            while (cur != null) {
                System.out.print(cur.getData());
                if (cur.next() != null)
                    System.out.print("->");
                cur = cur.next();
            }
        } else{
            System.out.println("The linked list is empty");
        }
    }

    // Adds a new node to the end of list
    public void insert(int data) {
        if(head != null){
            Node cur = head;
            while(cur.next() != null){
                cur = cur.next();
            }
            Node newNode = new Node(data);
            cur.setNext(newNode);
        } else {
            head = new Node(data);
        }
    }

    // Adds a new node to the beginning of list
    public void insertToBeginning(int data){
        Node n = new Node(data);
        if(head != null){
            n.setNext(head);
        }
        head = n;
    }

    public void delete(int data){
        if(head != null) {
            Node cur = head;
            if(cur.getData() == data) {
                head = cur.next();
                return;
            }
            while(cur.next() != null) {
                if(cur.next().getData() == data) {
                    cur.setNext(cur.next().next());
                    return;
                } else {
                    cur = cur.next();
                }
            }
        } else {
            System.out.println("The linked list is empty");
        }
    }

    public void search(int data){
        int position = -1;
        if(head != null){
            Node cur = head;
            while(cur != null) {
                position++;
                if(cur.getData() != data){
                    cur = cur.next();
                } else {
                    System.out.println("The data is an element of the linked list at position:" + position);
                    break;
                }
            }
        } else {
            System.out.println("The linked list is empty");
        }
    }
    public void displayInReverse(Node head){
        if(head!=null){
            displayInReverseRecursion(head);
        }
        else {
            System.out.println("The link list is empty");
        }
    }

    public void displayInReverseRecursion(Node current){
        if(current != null){
            displayInReverseRecursion(current.next());
            System.out.print(current.getData() + "-> ");
        }

    }

    public Node Reverse() {
        if(head!=null){
            Node a = head;
            Node b = head.next();
            if(b == null){
                return a;
            }
            Node c = head.next().next();
            a.setNext(null);
            while(c!=null){
                b.setNext(a);
                a = b;
                b = c;
                c = c.next();
            }
            b.setNext(a);
            head = b;
        }
        return head;
    }

}
