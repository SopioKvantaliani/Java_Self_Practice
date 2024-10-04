package day10_practice_tasks;

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