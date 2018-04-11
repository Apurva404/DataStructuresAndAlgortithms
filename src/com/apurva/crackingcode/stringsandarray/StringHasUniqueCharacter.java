package com.apurva.crackingcode.stringsandarray;

public class StringHasUniqueCharacter {

    public boolean checkString(String word){
        boolean result = true;
        int n,i,j = 0;
        n = word.length();
        for( i = 0; i < n-1 ; i++){
            for (j = i + 1; j < n; j++){
                if(word.charAt(i)!= word.charAt(j)){
                    continue;
                }
                else
                    result = false;
            }
        }
        return result;
    }

}
