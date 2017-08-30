package com.apurva.algorithms;

/**
 * Created by Apurva on 8/29/2017.
 */
public abstract class AbstractSort {
    protected int [] a;

    public AbstractSort(int arrayIn[]){
        a = arrayIn;
    }

    public void setArray(int numberArray[]){
        a = numberArray;
    }

    public abstract int[] sortInIncreasingOrder();

    public abstract int[] sortInDecreasingOrder();

    public void displayArray(){
        for (int i=0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
}
