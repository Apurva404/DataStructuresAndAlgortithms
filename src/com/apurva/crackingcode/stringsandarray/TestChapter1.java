package com.apurva.crackingcode.stringsandarray;

import java.util.Scanner;

public class TestChapter1 {
    public static void main(String [] args){

       //to check if a String has all unique characters or not
        FacbookProb prob = new FacbookProb();
        System.out.println("Enter the length of the integer arary");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int[] sampleArray = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter the element of the integer arary");
            sampleArray[i] = s1.nextInt();

        }
        int count = prob.countPair(sampleArray);
        System.out.println("The count of pairs in the array whose sum is 0 is:" + count);

//        Scanner s1 = new Scanner(System.in);
//        StringHasUniqueCharacter s = new StringHasUniqueCharacter();
//        System.out.println("Enter you string: ");
//        String word = s1.next();
//        if(s.checkString(word)){
//            System.out.println("The string has all unique characters");
//        }
//        else
//            System.out.println("The string has duplicate characters");
//
//        //to reverse a C Style String
//        Scanner s2 = new Scanner(System.in);
//        System.out.println("Enter you c style string to be reversed");
//        String inputString = s2.next();
//
//        String reversedString = new String();
//        ReverseCStyleString r = new ReverseCStyleString();
//
//        reversedString = r.reverseString(inputString.toCharArray());
//        System.out.println("The reverse of string is:" + reversedString);
//
//        //to remove duplicate from string in place
//        Scanner s3 = new Scanner(System.in);
//        System.out.println("Enter you string to remove duplicates:");
//        char[] stringWithoutDuplicates;
//        String userInput = s3.next();
//        char [] stringWithDuplicates = userInput.toCharArray();
//        System.out.println("Your string with duplicates is:"+ new String(stringWithDuplicates));
//        RemoveDuplicateFromString rs = new RemoveDuplicateFromString();
//        stringWithoutDuplicates = rs.removeDuplicate(stringWithDuplicates);
//        System.out.println("Your string without duplicates is:"+ new String(stringWithoutDuplicates));
//
//        //to check if two string are anagram
//        Scanner s4 = new Scanner(System.in);
//        System.out.println("Enter your first string:");
//        String firstString = s4.next();
//        char[] firstCharArray = firstString.toCharArray();
//
//        Scanner s5 = new Scanner(System.in);
//        System.out.println("Enter your second string:");
//        String secondString = s5.next();
//        char[] secondCharArray = secondString.toCharArray();
//        AnagramString checkString = new AnagramString();
//        boolean result= checkString.isAnagram(firstCharArray,secondCharArray);
//        if(result)
//            System.out.println("The strings are anagram");
//        else
//            System.out.println("The strings are not anagram");
//
//
//       // to replace the spaces in a string with %20
//        Scanner s6 = new Scanner(System.in);
//        System.out.println("Enter your string with spaces:");
//        String myString = s6.nextLine();
//        char[] stringWithSpaces = myString.toCharArray();
//        StringSpaceReplacer  newSpaceReplacer = new StringSpaceReplacer();
//        char [] stringWithoutSpaces = newSpaceReplacer.replaceSpaces(stringWithSpaces);
//        System.out.println("The string without spaces is:" + new String(stringWithoutSpaces));
//
//        System.out.println("Enter the size(N) of the matrix:" );
//        Scanner matrixSizeInput = new Scanner(System.in);
//        int n = matrixSizeInput.nextInt();
//        int[][] myMatrix = new int[n][n];
//        int [][] rotatedMatrix = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                Scanner matrixElement = new Scanner(System.in);
//                System.out.println("Enter the matrix element at:"+ "(" + i + "," + j+ ")");
//                myMatrix[i][j] = matrixElement.nextInt();
//            }
//        }
//        ImagePixelMatrix newImageMatrix = new ImagePixelMatrix();
//        rotatedMatrix=  newImageMatrix.rotateBy90AntiClockwise(myMatrix);
//        System.out.println("The rotated matrix is:");
//        for(int i=0;i<n;i++){
//            System.out.print("[");
//            for(int j=0;j<n;j++){
//                System.out.print(rotatedMatrix[i][j]+",");
//            }
//            System.out.print("]");
//            System.out.println(" ");
//        }
//
//        //update rows and columns of a matrxi having an element as 0
//        System.out.println("Enter the size(N) of the matrix:" );
//        Scanner sizeInput = new Scanner(System.in);
//        int m = sizeInput.nextInt();
//        int[][] matrix1 = new int[m][m];
//        int[][] matrix2 = new int[m][m];
//
//        for(int i=0;i<m;i++){
//            for(int j=0;j<m;j++){
//                Scanner element = new Scanner(System.in);
//                System.out.println("Enter the matrix element at:"+ "(" + i + "," + j+ ")");
//                matrix1[i][j] = element.nextInt();
//            }
//        }
//        UpdateMatrixHavingZero newMatrix = new UpdateMatrixHavingZero();
//        matrix2=  newMatrix.updateMatrix(matrix1);
//        System.out.println("The updated matrix is:");
//        for(int i=0;i<m;i++){
//            System.out.print("[");
//            for(int j=0;j<m;j++){
//                System.out.print(matrix2[i][j]+",");
//            }
//            System.out.print("]");
//            System.out.println(" ");
//        }
//
//        Scanner userInput7 = new Scanner(System.in);
//        Scanner userInput8 = new Scanner(System.in);
//        System.out.println("Enter your first string:");
//        String string1 = userInput7.next();
//        System.out.println("Enter your second string:");
//        String string2 = userInput8.next();
//        RotatedString newRs = new RotatedString();
//        if(newRs.isRotatedString(string1,string2))
//            System.out.println("String2 is rotated version of String1");
//        else
//            System.out.println("String2 is not a rotated version of String1");

    }
}
