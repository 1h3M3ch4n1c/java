package javaTraining;

import java.io.*;


public class fileParsingOneSecond {

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
        while((sStr=fInB.readLine())!=null){
            System.out.println(sStr);
        }

        //close the BufferedReader
        fInB.close();

        //close the FileInputStream
        fIn.close();

    }


}
