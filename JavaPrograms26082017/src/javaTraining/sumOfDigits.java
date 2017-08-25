package javaTraining;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        //declare the scanner class
        Scanner objScanIn = new Scanner(System.in);

        //get the number
        int iNumber = objScanIn.nextInt();

        //print the number
        System.out.println("Input number: "+iNumber);

        System.out.println("The sum of digits in the number: "+sumDigitsNumber(iNumber));
    }

    public static int sumDigitsNumber(int iInputNumber){
        return (iInputNumber>0)?(iInputNumber%10)+sumDigitsNumber(iInputNumber/10):iInputNumber/10;
    }
}
