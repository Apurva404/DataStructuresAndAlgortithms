package com.apurva.crackingcode.stringsandarray;

public class RemoveDuplicateFromString {

    public char[] removeDuplicate(char [] word){
        int n = word.length;
        int first_star_pos=0;
        //replacing duplicate characters with *
        for (int i = 0; i < n-1 ; i++){
            for(int j = i+1; j<n; j++){
                if(word[i] == word[j]){
                    word[j] = '*';
                }

            }
        }
        //removing * from the string
        //find the position of first * character
        for(int i=0;i<n;i++){
            if(word[i]== '*'){
                first_star_pos = i;
                break;
            }
        }
        //System.out.println("the first star character is at:" + first_star_pos);
        //remove star characters from the string
        for(int i =0; i < n-1; i++){
            if(word[i] == '*'){
                if(word[i+1]== '*'){
                    continue;
                }
                else {
                    char temp = word[i+1];
                    word[first_star_pos] = temp;
                    word[i+1] = '*';
                    first_star_pos = first_star_pos +1;
                }
            }
        }
        char[] newWord = new char[first_star_pos];
        for (int i=0; i<first_star_pos;i++){
            newWord[i] = word[i];
        }
        return newWord;
    }



}
