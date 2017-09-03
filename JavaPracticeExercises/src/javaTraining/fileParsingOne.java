package javaTraining;

/*program to write content into the file*/

import java.io.*;

public class fileParsingOne{

        public static void main(String[] args) throws IOException{

            //Writing Data into the file
            File fOut = new File("FileOne.txt");
            FileWriter fOutWriter = new FileWriter(fOut);

            for(int k = 0; k<10; k++){
                fOutWriter.write("This is Line "+k+"\n");
            }
            fOutWriter.close();

            //reading data from the file
            FileInputStream fIn =  new FileInputStream("FileOne.txt");
            BufferedReader fBin = new BufferedReader(new InputStreamReader(fIn));

            String sStr;
            while((sStr=fBin.readLine())!=null){
                System.out.println(sStr);
            }
            fBin.close();
            fIn.close();

        }

}
