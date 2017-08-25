/*
Program to find factorial
of a number
 */

package javaTraining;

import java.util.Scanner;

public class factorialOfANumber {

        public static void main(String[] args){

            //declare the scanner class
            Scanner objScanIn = new Scanner(System.in);

            //get the input from the console
            int iNumber = objScanIn.nextInt();

            //display the number
            System.out.println("Given number: "+iNumber);

            //call the factorialFunction
            System.out.println("factorial of a number: "+factorialFunction(iNumber));
        }

        public static int factorialFunction(int iNumber){
            return (iNumber == 0 || iNumber ==1)?1:iNumber*factorialFunction(iNumber-1);
        }

}
