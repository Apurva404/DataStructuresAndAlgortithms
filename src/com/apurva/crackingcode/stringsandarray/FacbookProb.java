package com.apurva.crackingcode.stringsandarray;

public class FacbookProb {

    public int countPair(int[] a){
        int count =0;
        int n = a.length;
        for(int i=0; i<n ;i++){
            for(int j=i+1; j<n; j++){
                if( a[i] + a[j] ==0)
                    count++;
            }
        }

        return count;
    }
}
