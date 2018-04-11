package com.apurva.crackingcode.stringsandarray;

public class RotatedString {
    public boolean isRotatedString(String a, String b){
        boolean result = false;
        if(a.length() == b.length()){
            String c = new String();
            c = c.concat(b);
            c = c.concat(b);
            if(c.contains(a))
                result = true;
        }
        return result;
    }
}
