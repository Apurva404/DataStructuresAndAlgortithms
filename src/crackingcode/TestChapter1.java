package crackingcode;

import java.util.Scanner;

public class TestChapter1 {
    public static void main(String [] args){

        //to check if a String has all unique characters or not
        Scanner s1 = new Scanner(System.in);
        StringHasUniqueCharacter s = new StringHasUniqueCharacter();
        System.out.println("Enter you string: ");
        String word = s1.next();
        if(s.checkString(word)){
            System.out.println("The string has all unique characters");
        }
        else
            System.out.println("The string has duplicate characters");

        //to reverse a C Style String
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter you c style string to be reversed");
        String inputString = s2.next();

        String reversedString = new String();
        ReverseCStyleString r = new ReverseCStyleString();

        reversedString = r.reverseString(inputString.toCharArray());
        System.out.println("The reverse of string is:" + reversedString);

        //to remove duplicate from string in place
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter you string to remove duplicates:");
        char[] stringWithoutDuplicates;
        String userInput = s3.next();
        char [] stringWithDuplicates = userInput.toCharArray();
        System.out.println("Your string with duplicates is:"+ new String(stringWithDuplicates));
        RemoveDuplicateFromString rs = new RemoveDuplicateFromString();
        stringWithoutDuplicates = rs.removeDuplicate(stringWithDuplicates);
        System.out.println("Your string without duplicates is:"+ new String(stringWithoutDuplicates));

    }
}
