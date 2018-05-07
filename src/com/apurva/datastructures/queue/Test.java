package com.apurva.datastructures.queue;


import java.util.Scanner;

import static java.lang.System.exit;

public class Test {
    public static void main(String args[]){
        Queue newQueue = new Queue();
        Scanner userInput = new Scanner(System.in);
        do
        {
            System.out.println("Choose from the menu:");
            System.out.println("1.Display");
            System.out.println("2.Insert/Enqueue");
            System.out.println("3.Delete/Dequeue");
            System.out.println("4.Peek");
            System.out.println("5.Exit");

            switch(userInput.nextInt()){

                case 1: newQueue.display();
                        break;

                case 2: System.out.println("Enter the data to be inserted in the queue:");
                        newQueue.enqueue(userInput.nextInt());
                        break;

                case 3: int data = newQueue.dequeue();
                        System.out.println("The first node of the queue has been removed with the value:" +data);
                        break;

                case 4: int firstInQueue = newQueue.peek();
                        System.out.println("The first node of the queue is with the value:" +firstInQueue);
                        break;

                case 5: exit(0);
            }
            System.out.println("\nDo you want to continue?:Y or N");
            userInput.nextLine();
        }while(userInput.next().equalsIgnoreCase("Y"));
    }
}
