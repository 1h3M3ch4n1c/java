/*
program to remove extra spaces
from the given string
 */

package javaTraining;

import java.lang.StringBuffer;     //import String Buffer
import java.util.StringTokenizer;   //import String Tokenizer
import java.util.Scanner;   //import Scanner

public class removeExtraSpacesFromAString {

    public static void main(String[] args){
        //declare the Scanner class
        Scanner objScanIn = new Scanner(System.in);

        //take the input from the console
        String strIn = objScanIn.nextLine();

        //call the function removeExtraSpaces
        System.out.println("The given input string: "+strIn);
        System.out.println("The string after removing extra spaces: ");
        removeExtraSpaces(strIn);
    }

    public static void removeExtraSpaces(String strIn){

        //use string tokenizer split the sting
        //based on spaces
        StringTokenizer strSub = new StringTokenizer(strIn," ");

        //declare the string buffer
        StringBuffer strBuff = new StringBuffer();

        //add elements into the
        //string buffer till the end of the StringTokenizer
        while(strSub.hasMoreElements()){
            strBuff.append(strSub.nextElement()).append(" ");
        }

        //display the string
        System.out.println(strBuff.toString());
    }

}

