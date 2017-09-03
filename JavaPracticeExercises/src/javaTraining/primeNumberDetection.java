/*
Program for prime number detection
 */
package javaTraining;

//import Scanner class
import java.util.Scanner;

public class primeNumberDetection {

    public static void main(String[] args){
        //declare the scanner class
        Scanner objScanIn = new Scanner(System.in);

        //get the input from the console
        int iNumber = objScanIn.nextInt();

        //display the number
        System.out.println("Input number: "+iNumber);

        //call the primeNumberProcessing function
        System.out.println("Given number: "+iNumber+" is: "+primeNumberProcessing(iNumber));
    }

    public static String primeNumberProcessing(int iNumberArg){

        int iStart = 2;     //Starting the division from first even number
        int iCount = 0;     //Count for number of successful divisions

        if (iNumberArg == 1)    //If the given number is One
            return "neither prime nor composite";   //return that it is neither prime nor composite
        else{
            //divide the given number
            //Starting from 2 to till the rounded of sqrt of the number
            while(iStart <= (int) Math.round(Math.sqrt(iNumberArg))){
                if ((iNumberArg%iStart) == 0)
                    iCount += 1;
                iStart += 1;
            }

            if ((iCount!=0) && (iNumberArg!=2))      //if there are more than one successful division and the given number is not 2
                return "not a Prime Number";       //return number is not a prime number
            else                //else
                return "is a Prime Number";         //return number is a prime number
        }
    }
}
