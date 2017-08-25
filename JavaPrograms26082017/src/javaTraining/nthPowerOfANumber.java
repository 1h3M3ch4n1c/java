package javaTraining;

import java.util.Scanner;

public class nthPowerOfANumber {

    public static void main(String[] args){

        Scanner objScanIn = new Scanner(System.in);

        int iNumber = objScanIn.nextInt();
        int iPower = objScanIn.nextInt();

        System.out.println("Power of "+iNumber+" to the Power of "+iPower+" is :"+powerOfNumberRecursion(iNumber,iPower));
        System.out.println("Power of "+iNumber+" to the Power of "+iPower+" is :"+powerOfNumberWoRecursion(iNumber,iPower));
    }

    public static int powerOfNumberRecursion(int iNumber,int iPower){

        if (iPower == 0 || iNumber == 1)
            return 1;
        else{
            return iNumber*powerOfNumberRecursion(iNumber,iPower-1);
        }
    }

    public static int powerOfNumberWoRecursion(int iNumber,int iPower){
        int iValue = 1;
        if (iPower == 0 || iNumber == 1)
            return 1;
        else{
            for (int iItr = 1;iItr<=iPower;iItr++)
                iValue = iValue*iNumber;
        }
        return iValue;
    }
}
