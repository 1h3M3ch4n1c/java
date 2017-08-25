package javaTraining;

//Program to removeDuplicates from an array
//And return a List

import java.util.*;

public class removeDuplicatedFromAnArray {

    public static void main(String[] args){

        //Array List Invocation
        ArrayList<Integer> arrayListOne = new ArrayList<Integer>();

        //Integer Array
        int[] arrayOne = new int[15];

        //Add elements into the ArrayList
        for (int i = 0; i<10; i++){
            arrayListOne.add(i);
            arrayOne[i] = i*i;
        }

        for (int i = 0; i<5; i++){
            arrayListOne.add(i);
            arrayOne[i] = i*i;
        }

        //Displaying the unique numbers
        System.out.println("Below is the list of unique numbers");
        System.out.println("Unique list:"+processListOne(arrayListOne));
        System.out.println("Unique Array:");
        for (int k : processListTwo(arrayOne)){
            System.out.print(k+"\t");
        }
    }

    //for ArrayList
    public static Set<Integer> processListOne(ArrayList<Integer> arrayListOne){
        //Declare HashSets
        final Set<Integer> finalSetOne = new HashSet<Integer>();

        //Add elements into the Set if not already present
        for (int iItr: arrayListOne){
            finalSetOne.add(iItr);
        }
        return  finalSetOne;
    }

    //for Integer Array
    public static int[] processListTwo(int[] arrayOne){
        //Declare HashSets
        final Set<Integer> finalSetOne = new HashSet<Integer>();

        //Add elements into the Set if not already present
        for (int iItr: arrayOne){
            finalSetOne.add(iItr);
        }
        //declare an array
        final int[] finalArrayOne = new int[finalSetOne.size()];
        Iterator<Integer> finalSetOneIterator = finalSetOne.iterator();

        //add elements into the array
        int jItr = 0;   //iterator variable
        while(finalSetOneIterator.hasNext() && jItr < finalArrayOne.length){
            finalArrayOne[jItr] = finalSetOneIterator.next();
            jItr += 1;
        }

        return  finalArrayOne;
    }

}
