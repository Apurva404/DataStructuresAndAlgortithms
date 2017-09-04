package com.apurva.algorithms;

/**
 * Created by Apurva on 9/3/2017.
 */
public class MergeSort extends AbstractSort {
    public MergeSort(int[] arrayIn, int sortingOrderIn) {
        super(arrayIn, sortingOrderIn);
    }

    @Override
    public int[] sort() {
        mergeSort(0,(a.length - 1));
        return a;
    }

    public void mergeSort(int p, int r){
        if (p < r) {
            int q = (p+r)/2;
            mergeSort(p, q);
            mergeSort(q+1, r);
            merge(p, q, r);
        }
    }

    public void merge(int p, int q, int r){
        int n1 = (q - p) + 1;
        int n2 = r - q;
        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];
        for(int i=0; i < n1; i++)
            L[i] = a[p+i];
        for(int i=0; i<n2; i++)
            R[i] = a[q+1+i];
        if (sortingOrder == 1) {
            L[n1] = Integer.MAX_VALUE;
            R[n2] = Integer.MAX_VALUE;
        } else {
            L[n1] = Integer.MIN_VALUE;
            R[n2] = Integer.MIN_VALUE;
        }

        int i=0, j=0;
        for(int k = p ; k <= r ; k++){
            if (((sortingOrder == 1) && (L[i] <= R[j])) || ((sortingOrder == 2) && (L[i] >= R[j]))) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
        }
    }
}
