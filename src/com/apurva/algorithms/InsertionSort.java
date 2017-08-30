package com.apurva.algorithms;

/**
 * Created by Apurva on 8/29/2017.
 */
public class InsertionSort extends AbstractSort{
    public InsertionSort(int arrayIn[]){
        super(arrayIn);
    }

    public int[] sortInIncreasingOrder() {
        int arraySize = a.length;

        for (int j = 1; j < arraySize; j++) {
            int key = a[j];
            int i = j-1;
            while (i>=0 && a[i]> key){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
        return a;
    }

    public int[] sortInDecreasingOrder() {
        int j = 0;
        int arraySize = a.length;

        for (j = 1; j < arraySize; j++) {
            int key = a[j];
            int i = j-1;
            while (i>=0 && a[i]< key){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
        return a;
    }


}
