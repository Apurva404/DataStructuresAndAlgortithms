package com.apurva.crackingcode.stringsandarray;

public class AnagramString {
    public boolean isAnagram(char[] a, char[] b){
        boolean result=true;
        if(a.length == b.length){
            a = sortCharArray(a);
            b= sortCharArray(b);
            for(int i=0; i<a.length;i++){
                if(a[i]!=b[i]){
                    result=false;
                    break;
                }

            }
        }
        return result;
    }

    public char[] sortCharArray(char [] a){
        int n = a.length;char temp;
        for (int i=0; i <n-1; i++){
            for(int j=i+1; j<n;j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        return a;
    }

}
