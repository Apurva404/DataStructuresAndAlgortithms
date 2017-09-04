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

        if(sortingOrder == 1){
            for (int j = 1; j < arraySize; j++) {
                int key = a[j];
                int i = j-1;
                while (i>=0 && a[i]> key){
                    a[i+1] = a[i];
                    i--;
                }
                a[i+1] = key;
            }
        }
        else{
            for (int j = 1; j < arraySize; j++) {
                int key = a[j];
                int i = j-1;
                while (i>=0 && a[i]< key){
                    a[i+1] = a[i];
                    i--;
                }
                a[i+1] = key;
            }
        }
        return a;
    }
}
