package com.apurva.datastructures.tree;

import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of the root node:");
        int data = s.nextInt();
        s.nextLine();
        tree.insert(data);

        while(true){
            System.out.println("Enter yes/no if you want to add more nodes:");
            String answer = s.nextLine();

            if(!answer.startsWith("y"))
                break;

            System.out.println("Enter the value of the next node:");
            int newData = s.nextInt();
            s.nextLine();

            tree.insert(newData);
        }

        System.out.println("The elements of current tree  in order are:");
        System.out.println("-------------------------------------------------");
        tree.inOrderTraversal();

        System.out.println("\n\nThe elements of current tree  pre-order are:");
        System.out.println("-------------------------------------------------");
        tree.preOrderTraversal();

        System.out.println("\n\nThe elements of current tree  post-order are:");
        System.out.println("-------------------------------------------------");
        tree.postOrderTraversal();

    }
}
