/*Progrma to find first
two max values in an array
 */

package javaTraining;

//import Arrays
import java.util.Arrays;

public class firstTwoMaximumValuesInAnArray {

    public static void main(String[] args){

        //array initialisation
        //with random elements

        int[] arrayOne = new int[(int)Math.round(Math.random()*20)];
        for(int iItr = 0; iItr<arrayOne.length;iItr++){
             arrayOne[iItr]= (int)Math.round(Math.random()*100);
        }


        //display the elements
        System.out.println("The elements in the array are:");
        showList(arrayOne);


        //call the function one using built in functions
        System.out.println("\nThe first Two Max values in the array: ");
        firstTwoMaxValuesOne(arrayOne);

        //call the function two using custom logic
        System.out.println("\nThe first Two Max values in the array: ");
        firstTwoMaxValuesTwo(arrayOne);
    }

    public static void showList(int[] iArray){
        for(int iElement:iArray){
            System.out.print(iElement+"\t");
        }
    }

    public static void firstTwoMaxValuesOne(int[] iArray){
        Arrays.sort(iArray);
        for(int iElement:iArray){
            System.out.print(iElement+"\t");
        }
        int iLength = iArray.length;
        System.out.println("\nFirst Maximum Number: "+iArray[iLength-1]+"\tSecond Maximum Number: "+iArray[iLength-2]);
    }

    public static void firstTwoMaxValuesTwo(int[] iArray){

        int iMaxOne = 0;    //First maximum element
        int iMaxTwo = 0;    //Second maximum element
        for(int iElement:iArray){
            if (iElement>=iMaxOne) {
                iMaxTwo = iMaxOne;
                iMaxOne = iElement;
            }
            else if(iElement<=iMaxOne)
                iMaxTwo = iElement;
        }
        System.out.println("\nFirst maximum number: "+iMaxOne+"\tSecond Maximum Nummber:"+iMaxTwo);
    }
}
