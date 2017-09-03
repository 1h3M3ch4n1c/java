/*
Program to check the
Palindrome property
 */

package javaTraining;

import java.util.Scanner;       //import Scanner class

public class palindromeNumber {

    public static void main(String[] args){

        //declare the Scanner class
        Scanner objScanIn = new Scanner(System.in);

        //get the number
        long iNumber = objScanIn.nextInt();

        //display the number
        System.out.println("Given number: "+iNumber);

        //call the palindromeCheck function
        System.out.println("Given number: "+iNumber+" is: "+palindromeCheck(iNumber));
    }

    public static String palindromeCheck(long iNumber){

        long iReverseNumber = 0;
        long iNumberTemp = iNumber;

        //code to reverse the number
        while(iNumberTemp != 0){
            iReverseNumber = (iReverseNumber*10)+(iNumberTemp%10);
            iNumberTemp /= 10;
        }

        if(iReverseNumber == iNumber)
            return "a Palindrome";
        else
            return "not a Palindrome";

    }
}
