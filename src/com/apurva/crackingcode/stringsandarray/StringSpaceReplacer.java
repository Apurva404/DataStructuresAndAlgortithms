package com.apurva.crackingcode.stringsandarray;

public class StringSpaceReplacer {

    public char[] replaceSpaces(char[] a){
        int n = a.length;
        int newLen=0;
        int noOfSpaces =0;

        for(int i=0; i<n; i++){
            if(a[i] == ' ')
                noOfSpaces++;
        }
        System.out.println("no of spaces in string are:" + noOfSpaces);

        newLen = n + (2* noOfSpaces);
        char[] newStr = new char[newLen];
        int index =0;
        for(int j=0; j< newLen ; j++){
            if(a[index] != ' '){
                newStr[j] = a[index];
            }
            else{
                newStr[j++] = '%';
                newStr[j++] = '2';
                newStr[j] = '0';
            }
            index++;
        }
        return newStr;
    }

}
