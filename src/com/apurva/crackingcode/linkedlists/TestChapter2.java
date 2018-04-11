package com.apurva.crackingcode.linkedlists;

import java.util.Scanner;

public class TestChapter2 {
    public static void main(String args[]){
        System.out.println("This program works with Linked List data structure");
        //System.out.println("Enter the no of elements you want to enter in the linked list:");
        System.out.println("For creating a linked list enter the element:");
        Scanner s = new Scanner(System.in);
        Node n = new Node(s.nextInt());
        n.printLinkedList();

        System.out.println("For adding an element to linked list enter the element's value:");
        Scanner s2 = new Scanner(System.in);
        n.addNewNodeToEnd(s2.nextInt());
        System.out.println("Linked List after adding new node to the end:");
        n.printLinkedList();

    }

}
