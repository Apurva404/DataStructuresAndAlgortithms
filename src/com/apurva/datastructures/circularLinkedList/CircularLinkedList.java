package com.apurva.datastructures.circularLinkedList;

public class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        head = null;
    }

    public void display() {
        if (head != null) {
            Node cur = head;
            boolean processingHead = true;
            while (processingHead || (cur != head)) {
                System.out.print(cur.getData());
                if (cur.next() != head)
                    System.out.print("->");
                cur = cur.next();
                processingHead = false;
            }
        } else{
            System.out.println("The circular linked list is empty");
        }
    }

    // Adds a new node to the end of list
    public void insert(int data) {
        if(head != null){
            Node cur = head;
            while(cur.next() != head){
                cur = cur.next();
            }
            Node newNode = new Node(data);
            cur.setNext(newNode);
            newNode.setNext(head);
        } else {
            head = new Node(data);
            head.setNext(head);
        }
    }


    public void delete(int data){
        if(head != null) {
            Node cur = head;
            //deleting first node
            if(cur.getData() == data) {
                Node tail = head;
                while(tail.next() != head)
                    tail = tail.next();
                head = cur.next();
                tail.setNext(head);
                return;
            }
            while(cur.next() != head) {
                if(cur.next().getData() == data) {
                    cur.setNext(cur.next().next());
                    return;
                } else {
                    cur = cur.next();
                }
            }
            //deleting last node
            if(cur.next().next() == head && cur.next().getData() == data){
                cur.setNext(head);
                return;

            }
        } else {
            System.out.println("The circular linked list is empty");
        }
    }
//
//    public void search(int data){
//        int position = -1;
//        if(head != null){
//            Node cur = head;
//            while(cur != null) {
//                position++;
//                if(cur.getData() != data){
//                    cur = cur.next();
//                } else {
//                    System.out.println("The data is an element of the linked list at position:" + position);
//                    break;
//                }
//            }
//        } else {
//            System.out.println("The linked list is empty");
//        }
//    }
//    public void displayInReverse(Node head){
//        if(head!=null){
//            displayInReverseRecursion(head);
//        }
//        else {
//            System.out.println("The link list is empty");
//        }
//    }
//
//    public void displayInReverseRecursion(Node current){
//        if(current != null){
//            displayInReverseRecursion(current.next());
//            System.out.print(current.getData() + "-> ");
//        }
//
//    }
//
//    public Node Reverse() {
//        if(head!=null){
//            Node a = head;
//            Node b = head.next();
//            if(b == null){
//                return a;
//            }
//            Node c = head.next().next();
//            a.setNext(null);
//            while(c!=null){
//                b.setNext(a);
//                a = b;
//                b = c;
//                c = c.next();
//            }
//            b.setNext(a);
//            head = b;
//        }
//        return head;
//    }


}
