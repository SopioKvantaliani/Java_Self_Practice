package java_interview;

import java.util.Arrays;

public class ReverseStringWithoutReversingWords {

    public static void main(String[] args) {

        String str = "My name is Sopo";
        String convertedStr = "";

        String [] splitStr = str.split(" ");
        System.out.println(Arrays.asList(splitStr));

        for (int i = splitStr.length-1; i>=0; i--) {
            convertedStr += splitStr[i]+" ";
        }
        System.out.println(convertedStr);
    }
}
