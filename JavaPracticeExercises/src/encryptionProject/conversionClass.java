package encryptionProject;

import java.util.Scanner;

public class conversionClass {

    public conversionClass(){

    }

    public static String textToBinaryConverter(String inputText){
        int idecCount = 0;
        int ibinCount = 0;
        int decimalEquivalent=0;
        String binaryEquivalent = "";

        while(idecCount<inputText.length()){
            decimalEquivalent = (int)inputText.charAt(idecCount);
            int tempDecimalEquivalent = decimalEquivalent;
            while(tempDecimalEquivalent>0){
                binaryEquivalent = tempDecimalEquivalent % 2 + binaryEquivalent;
                tempDecimalEquivalent = tempDecimalEquivalent / 2;
            }
            if (decimalEquivalent<64)
                binaryEquivalent = "0"+binaryEquivalent;

            idecCount += 1;
        }

        return binaryEquivalent;
    }

    public static String binaryToTextConverter(String inputBinary){
        String textEquivalent = "";
        String binaryBufferCut = "";

        int iBinaryIndex = inputBinary.length();

        //Extract the 7 digits
        while(iBinaryIndex>0){
            binaryBufferCut = inputBinary.substring(iBinaryIndex-7,iBinaryIndex);
            //Convert the 7 digits to decimal equivalent
            int iBinaryBufferCutIndex = binaryBufferCut.length();
            int iDecimalEquivalent = 0;
            int iItrOne = 0;
            while(iItrOne<iBinaryBufferCutIndex){
                iDecimalEquivalent += Integer.parseInt(String.valueOf(binaryBufferCut.charAt(iBinaryBufferCutIndex-iItrOne-1)))*Math.pow(2,iItrOne);
                iItrOne += 1;
            }
            textEquivalent += String.valueOf((char)iDecimalEquivalent);
            iBinaryIndex -= 7;
        }
        return textEquivalent;
    }


    public static void main(String[] args){
        Scanner sysIn = new Scanner(System.in);
        System.out.println("Enter the text:");
        String textIn = sysIn.nextLine();
        String textOutOne = textToBinaryConverter(textIn);
        System.out.println(textOutOne);
//        binaryToTextConverter(textOutOne);
        System.out.println(binaryToTextConverter(textOutOne));

        sysIn.close();
    }
}
