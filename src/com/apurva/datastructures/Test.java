package com.apurva.datastructures;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {

        System.out.println("Enter the value of the first node:");
        Scanner firstNodeInput = new Scanner(System.in);
        int data = firstNodeInput.nextInt();
        SinglyLinkedListNode firstNode = new SinglyLinkedListNode(data);

        System.out.println("Enter yes/no if you want to add more nodes:");
        Scanner userInput1 = new Scanner(System.in);
        String s = userInput1.nextLine();

        while(s.equalsIgnoreCase("yes")){
            System.out.println("Enter the value of the next node:");
            Scanner nodeInput = new Scanner(System.in);
            int newData = nodeInput.nextInt();

            System.out.println("Enter the position of the new node:beginning(b) or end(e)?");
            Scanner insertPosition = new Scanner(System.in);
            String position = insertPosition.nextLine();

            if(position.equalsIgnoreCase("b")) {
                SinglyLinkedListNode newNode = new SinglyLinkedListNode(newData);
                firstNode.insertToBeginning(newNode);
                firstNode = newNode;
            }
            else {
                firstNode.insert(newData);
            }
            System.out.println("Enter yes/no if you want to add more nodes:");
            s = userInput1.nextLine();
        }
        firstNode.display();
    }
}

