/*Program to reverse
    a given number
 */

package javaTraining;

//import Scanner class
import java.util.Scanner;

public class reversingANumber {

    public static void main(String[] args){
        //declare the scanner class
        Scanner objScanIn = new Scanner(System.in);

        //get the number
        int iNumber = objScanIn.nextInt();

        //print the number
        System.out.println("Input number: "+iNumber);

        //call the function to reverse the number
        System.out.println("The reversed number: "+reverseNumber(iNumber));
    }

    public static int reverseNumber(int iInputNumber){
        int iReverseNumber = 0;
        int iNumberOfDigits = 0;

        //code to reverse the number
        while(iInputNumber!= 0){
            iNumberOfDigits += 1;   //counter for number of digits
            iReverseNumber = (iReverseNumber*10)+(iInputNumber%10);
            iInputNumber /= 10;
        }
        System.out.println("Number of digits in the number: "+iNumberOfDigits);
        return iReverseNumber;
    }

}
