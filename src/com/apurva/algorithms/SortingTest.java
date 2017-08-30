package com.apurva.algorithms;

import java.util.Scanner;

/**
 * Created by Apurva on 8/29/2017.
 */
public class SortingTest {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size = in. nextInt();
        in.nextLine();

        int [] numberArray = new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i=0; i < size; i++){
            if (in.hasNextInt()) {
                numberArray[i] = in.nextInt();
            }
            else {
                System.out.println("Please enter only integer");
                System.exit(1);
            }
        }

        InsertionSort integerArray = new InsertionSort(numberArray);
        integerArray.sortInIncreasingOrder();
        System.out.println("Sorted Array in ascending order :");
        integerArray.displayArray();
        integerArray.sortInDecreasingOrder();
        System.out.println("Sorted Array in descending order :");
        integerArray.displayArray();


    }
}

