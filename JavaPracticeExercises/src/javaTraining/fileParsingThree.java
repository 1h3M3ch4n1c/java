package javaTraining;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class fileParsingThree {

    public static void main(String[] args){
        try {

            //get the input from the user
            Scanner userIn = new Scanner(System.in);
            String userInput = userIn.nextLine();

            //create a FileInputStream
            FileInputStream fileIn = new FileInputStream("FileFour.txt");

            //create a buffered reader
            BufferedReader bfrdReader = new BufferedReader(new InputStreamReader(fileIn));

            //create an empty string
            String strReadOne;

            //create an ArrayList
            ArrayList<String> arrayListOne = new ArrayList<String>();


            //read the lines from the file
            while((strReadOne = bfrdReader.readLine())!=null){
                arrayListOne.add(strReadOne);
            }

            for (String strReadTwo: arrayListOne){
                try {
                    if (strReadTwo.split(" ")[1].equals(userInput)) {
                        System.out.println(strReadTwo.split(" ")[0]);
                    }
                }
                catch (Exception exceptionReasonTwo){
                    exceptionReasonTwo.printStackTrace();
                }
            }
        }
        catch(Exception exceptionReason){
            exceptionReason.printStackTrace();
        }
    }
}
