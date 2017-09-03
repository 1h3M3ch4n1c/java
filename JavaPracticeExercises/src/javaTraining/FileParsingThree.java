package javaTraining;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileParsingThree {

    public static void main(String[] args) throws IOException{
        //Reading file
        FileInputStream fIn = new FileInputStream("FileThree.txt");

        //Buffered Reader
        BufferedReader fbIn = new BufferedReader(new InputStreamReader(fIn));

        //ArrayList<String> myArrayList = new ArrayList<String>();

        String sStr;

        sStr=fbIn.readLine();

        System.out.println(sStr);

        System.out.println(parseEachString(sStr));


        //close all
        fbIn.close();
        fIn.close();


    }

    public static ArrayList<String> parseEachString(String myString){
        ArrayList<String> finalList = new ArrayList<String>();
        List<String> myArraySplit;

        myArraySplit = Arrays.asList(myString.split(","));

        for(String strSplit:myArraySplit) {
            if (strSplit.contains(":")) {
                finalList.add(String.join(".",strSplit.trim().split(":")));
            }
            if (strSplit.contains("-")) {
                finalList.add(String.join(".",strSplit.trim().split("-")));
            }
        }

        //sort the list using collections
        Collections.sort(finalList);

        return finalList;
    }

}
