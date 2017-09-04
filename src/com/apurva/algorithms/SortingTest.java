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

        in.nextLine();
        System.out.println("Enter the order in which you want to sort the array:");
        System.out.println(" Enter 1 for ascending order");
        System.out.println(" Enter 2 for descending order");
        int sortingOrder = in.nextInt();

        //Insertion Sort
        InsertionSort iArray = new InsertionSort(numberArray, sortingOrder);
        iArray.sort();
        if(sortingOrder == 1){
            System.out.println("Sorted Array in ascending order using Insertion Sort:");
            iArray.displayArray();
        }
        else{
            System.out.println("Sorted Array in descending order using Insertion Sort :");
            iArray.displayArray();
        }

        //Merge Sort
        MergeSort mArray = new MergeSort(numberArray,sortingOrder);
        mArray.sort();
        System.out.println("Sorted Array using Merge Sort:");
        mArray.displayArray();

        //Selection Sort
        SelectionSort sArray = new SelectionSort(numberArray,sortingOrder);
        sArray.sort();
        System.out.println("Sorted Array using Selection Sort:");
        sArray.displayArray();


    }
}

