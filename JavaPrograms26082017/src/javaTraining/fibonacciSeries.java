/*
Program to generate a fibonacci series
 */
package javaTraining;

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args){
        int iCount = 0;
        Scanner objScanIn = new Scanner(System.in);
        int iNumber = objScanIn.nextInt();
        fibonacciWoRecursion(iNumber);
        while (iCount < iNumber) {
            System.out.print(fibonacciRecursion(iCount) + "\t");
            iCount += 1;
        }
    }


    public static void fibonacciWoRecursion(int iNumber){
        int a = 0;
        int b = 1;
        int iTemp;

        if (iNumber <= 0 || iNumber ==1)
            System.out.println("Enter a valid sequence length");
        else {
            System.out.print(a + "\t" + b + "\t");
            a = 1;
            b = 0;
        }
        int iCounter = 2;

        while(iCounter<iNumber){
            iTemp  = a;
            a = a+b;
            b = iTemp;

            System.out.print(a+"\t");
            iCounter += 1;
        }
        System.out.println();
    }

    public static int fibonacciRecursion(int iNumber){
        return (iNumber<=1)?iNumber:fibonacciRecursion(iNumber-1)+fibonacciRecursion(iNumber-2);
    }
}
