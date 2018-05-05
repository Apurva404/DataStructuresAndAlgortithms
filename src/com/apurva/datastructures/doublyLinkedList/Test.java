package com.apurva.datastructures.doublyLinkedList;

import java.util.Scanner;

import static java.lang.System.exit;

public class Test {
    public static void main(String args[]){
        DoublyLinkList newList = new DoublyLinkList();
        Scanner userInput = new Scanner(System.in);
        do
        {
            System.out.println("Choose from the menu:");
            System.out.println("1.Display");
            System.out.println("2.Display in reverse");
            System.out.println("3.Insert");
            System.out.println("4.Insert After a particular node");
            System.out.println("5.Delete");
            System.out.println("6.Delete last");
            System.out.println("7.Exit");
            switch(userInput.nextInt()){
                case 1: newList.display();
                        break;

                case 2: newList.displayReverse();
                        break;

                case 3: System.out.println("Enter the data value of the node:");
                        userInput.nextLine();
                        newList.insert(userInput.nextInt());
                        break;

                case 4:
                        System.out.println("Enter the data value of the node:");
                        int data = userInput.nextInt();
                        System.out.println("Enter the data value of the node after which you want insert the new node:");
                        int insertAfter = userInput.nextInt();
                        newList.insertAfter(data,insertAfter);
                        break;

                case 5: System.out.println("Enter the data value of the node:");
                        newList.delete(userInput.nextInt());
                        break;

                case 6: newList.deleteLast();
                        break;

                case 7: exit(0);
            }
            System.out.println("\nDo you want to continue?:Y or N");
            userInput.nextLine();
        }while(userInput.next().equalsIgnoreCase("Y"));
    }
}
