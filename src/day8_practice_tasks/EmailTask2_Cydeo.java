package day8_practice_tasks;

import java.util.Locale;

public class EmailTask2_Cydeo {
    public static void main(String[] args) {

        String email = "sopo_kvantaliani@gmail.com";

        int underscoreIndex = email.indexOf("_");
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");

        String firstName = email.substring(0, underscoreIndex);
        String lastName = email.substring(underscoreIndex+1, atIndex);
        String domain = email.substring(atIndex+1, dotIndex);

        System.out.println("First Name: "+fixFormat(firstName));
        System.out.println("Last Name: "+fixFormat(lastName));
        System.out.println("Domain: "+domain);


    }

    public static String fixFormat(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }
}
