package com.apurva.datastructures.circularLinkedList;

import java.util.Scanner;

import static java.lang.System.exit;

public class Test {
    public static void main(String args[]){
        CircularLinkedList newList = new CircularLinkedList();
        Scanner userInput = new Scanner(System.in);
        do
        {
            System.out.println("Choose from the menu:");
            System.out.println("1.Display");
            System.out.println("2.Insert");
            System.out.println("3.Delete");
            System.out.println("4.Exit");

            switch(userInput.nextInt()){

                case 1: newList.display();
                        break;

                case 2: System.out.println("Enter the data value of the node to be inserted:");
                        userInput.nextLine();
                        newList.insert(userInput.nextInt());
                        break;

                case 3: System.out.println("Enter the data value of the node to be deleted:");
                        userInput.nextLine();
                        newList.delete(userInput.nextInt());
                        break;

                case 4: exit(0);
            }
            System.out.println("\nDo you want to continue?:Y or N");
            userInput.nextLine();
        }while(userInput.next().equalsIgnoreCase("Y"));
    }
}
