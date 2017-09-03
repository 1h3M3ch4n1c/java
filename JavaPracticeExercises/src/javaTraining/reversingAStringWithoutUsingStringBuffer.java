/*
Program to reverse a string
Without using StringBuffer class
 */

package javaTraining;

import java.util.Scanner;

public class reversingAStringWithoutUsingStringBuffer {

    public static void main(String[] args){
        //declare a Scanner
        Scanner objScanIn = new Scanner(System.in);

        //get the input from the console
        String strIn = objScanIn.nextLine();

        //display the string before calling the function
        System.out.println("String before reversal: "+strIn);

        //call the stringReversal function
        //display the string after string reversal
        System.out.println("String after reversal using StringBufferClass: "+stringReversalUsingStringBuffer(strIn));
        System.out.println("String before reversal Without using StringBufferClass: "+stringReversalWoUsingStringBuffer(strIn));

        //verify both the outputs
        if (stringReversalUsingStringBuffer(strIn).equals(stringReversalWoUsingStringBuffer(strIn)))
            System.out.println("Both the outputs are equal");
        else
            System.out.println("Both the outputs are equal not equal and differs at: "+stringReversalUsingStringBuffer(strIn).compareTo(stringReversalWoUsingStringBuffer(strIn)));
    }

    public static String stringReversalWoUsingStringBuffer(String strIn){

        String strReversed = "";

        for(char cElement:strIn.toCharArray()){
            strReversed = cElement+strReversed;
        }

        return strReversed;
    }

    public static String stringReversalUsingStringBuffer(String strIn){

        StringBuffer strBuff = new StringBuffer(strIn);
        return strBuff.reverse().toString();
    }
}
