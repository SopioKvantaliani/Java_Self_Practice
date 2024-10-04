package day10_practice_tasks;

import java.util.Collections;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";
        str = str.replaceAll(" ", "");

        String upperCase = "", lowerCase = "";

        for (char each: str.toCharArray()){

            if (Character.isUpperCase(each)){
                upperCase +=each;
            }else {
                lowerCase+=each;
            }
        }
        if (upperCase.length()==lowerCase.length()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        System.out.println(upperLowerMath(str));


    }
    public static boolean upperLowerMath (String str){

        int upper = 0; int lower = 0;

        for (char each : str.toCharArray()){
            if (Character.isUpperCase(each)){
                upper++;
            } else if (Character.isLowerCase(each)) {
                lower++;
            }
        }
        return upper==lower;
    }

}

/*
2. Create a class called UpperCaseAndLowerCase and write a
program with the following specifications:
   2.1 Given a string, return true if the total number of
   uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */