package day8_practice_tasks;

import java.util.Locale;

public class EmailTask2 {
    public static void main(String[] args) {

        String email = "sopo_kvantaliani@yahoo.com";

        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.substring(0, 1).toUpperCase()+firstName.substring(1);

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("First name: "+firstName+"\nLast name: "+lastName+"\nDomain: "+domain);

    }
}
