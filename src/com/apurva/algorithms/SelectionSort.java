package com.apurva.algorithms;

/**
 * Created by Apurva on 9/3/2017.
 */
public class SelectionSort extends AbstractSort {

    public SelectionSort(int [] numberarrayIn, int sortingOrderIn){
        super(numberarrayIn,sortingOrderIn);
    }

    @Override
    public int[] sort() {
        int n = a.length;
        if(sortingOrder ==1){
            for(int i = 0; i < (n-1); i++){
                int minIndex = i;
                for(int j = (i+1); j < n; j++){
                    if (a[minIndex] > a[j])
                        minIndex = j;
                }
                int swap = a[i];
                a[i] = a[minIndex];
                a[minIndex] = swap;
            }
        }
        else {
            for(int i = 0; i < (n-1); i++){
                int maxIndex = i;
                for(int j = (i+1); j < n; j++){
                    if (a[maxIndex] < a[j])
                        maxIndex = j;
                }
                int swap = a[i];
                a[i] = a[maxIndex];
                a[maxIndex] = swap;
            }
        }

        return a;
    }

}
