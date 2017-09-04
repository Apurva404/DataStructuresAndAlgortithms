package com.apurva.algorithms;

/**
 * Created by Apurva on 8/29/2017.
 */
public abstract class AbstractSort {
    protected int [] a;
    protected int sortingOrder;

    public AbstractSort(int arrayIn[], int sortingOrderIn){
        a = arrayIn;
        sortingOrder = sortingOrderIn;
    }

    public void setArray(int numberArray[]){
        a = numberArray;
    }

    public abstract int[] sort();

    public void displayArray(){
        for (int i=0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
}
