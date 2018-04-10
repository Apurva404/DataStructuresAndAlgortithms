package com.apurva.crackingcode.chapter1;

public class ReverseCStyleString {
    public String reverseString(char [] word){
        int n = word.length;
        char[] newWord = new char[n];
        int i , j=0;
        for (i = n-1 ; i >= 0; i--){
            newWord[j++] = word[i];
        }
        return new String(newWord);
    }
}
