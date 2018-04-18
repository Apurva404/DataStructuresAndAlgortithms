package com.apurva.datastructures.singlyLinkedList;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of the first node:");
        int data = s.nextInt();
        s.nextLine();
        list.insert(data);

        while(true){
            System.out.println("Enter yes/no if you want to add more nodes:");
            String answer = s.nextLine();

            if(!answer.startsWith("y"))
                break;

            System.out.println("Enter the value of the next node:");
            int newData = s.nextInt();
            s.nextLine();

            System.out.println("Enter the position of the new node:beginning(b) or end(e)?");
            String position = s.nextLine();

            if(position.equalsIgnoreCase("b")) {
                list.insertToBeginning(newData);
            } else {
                list.insert(newData);
            }
        }

        System.out.println("The current elements of current linked list are:");
        System.out.println("-------------------------------------------------");
        list.display();

        System.out.println("\nEnter the value of the element you want to search in the linked List:");
        int searchData = s.nextInt();
        list.search(searchData);

        System.out.println("\nEnter the value of the element you want to delete from the linked List:");
        int deleteData = s.nextInt();
        list.delete(deleteData);
        list.display();
    }
}

