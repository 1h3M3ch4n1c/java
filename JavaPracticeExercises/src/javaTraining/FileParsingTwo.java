package javaTraining;

import java.io.*;
import java.util.ArrayList;


public class FileParsingTwo {
    public static void main(String[] args) throws IOException {

        //Writing to File
        //Creating File
        FileOutputStream fOut = new FileOutputStream("FileTwo.txt");

        //Use Buffered Writer
        BufferedWriter fOutBWriter = new BufferedWriter(new OutputStreamWriter(fOut));

        //Writing the line into the file
        for(int k = 0; k<10;k++){
            fOutBWriter.write("This is Line "+k+"\n");
        }

        //close Buffered Writer
        fOutBWriter.close();

        //close FileOutputStream
        fOut.close();


        //Reading from the file
        //Opening file
        FileInputStream fIn = new FileInputStream("FileTwo.txt");

        //Use Buffered Reader
        BufferedReader fInB = new BufferedReader(new InputStreamReader(fIn));

        //Read the lines from the file
        String sStr;

        //Array List
        ArrayList<Object> myArrayList = new ArrayList<Object>();

        while((sStr=fInB.readLine())!=null){
            myArrayList.add(sStr);
        }
        System.out.println(myArrayList);

        for(Object strElm:myArrayList){
            for (String sSplit:strElm.toString().split("\\s")){
                System.out.println(sSplit);
            }
        }


        //close the BufferedReader
        fInB.close();

        //close the FileInputStream
        fIn.close();

    }
}
