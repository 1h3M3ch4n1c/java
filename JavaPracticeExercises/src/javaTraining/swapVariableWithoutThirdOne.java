/*
program to swap variables
without a third variable
 */

package javaTraining;

import java.util.Scanner;

public class swapVariableWithoutThirdOne {

    public static void main(String[] args){
        //declare scanner
        Scanner objScanIn = new Scanner(System.in);

        //get the two numbers
        int iOne = objScanIn.nextInt();
        int iTwo = objScanIn.nextInt();

        //display the numbers before swapping
        System.out.println("Before swapping iOne:"+iOne+"\tiTwo:"+iTwo);

        //call the swapNumber function
        swapNumber(iOne,iTwo);
    }

    public static void swapNumber(int iNumberOne, int iNumberTwo){

        iNumberOne = iNumberOne-iNumberTwo;
        iNumberTwo = iNumberOne+iNumberTwo;
        iNumberOne = iNumberTwo-iNumberOne;
        //display the numbers after swapping
        System.out.println("Before swapping iOne:"+iNumberOne+"\tiTwo:"+iNumberTwo);
    }

}
