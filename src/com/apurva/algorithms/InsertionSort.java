package com.apurva.algorithms;

/**
 * Created by Apurva on 8/29/2017.
 */
public class InsertionSort extends AbstractSort{

    public InsertionSort(int arrayIn[], int sortingOrderIn){
        super(arrayIn, sortingOrderIn);
    }

    public int[] sort() {
        int arraySize = a.length;

        for (int i = 1; i < arraySize; i++) {
            int key = a[i];
            int j = i - 1;
            while ((j >= 0) && ((sortingOrder == 1) ? (a[j] > key) : (a[j] < key))) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        return a;
    }
}
