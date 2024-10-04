package day08_practice_tasks;

public class EmailTask1 {
    public static void main(String[] args) {

        String email = "levan_kikabidze@yahoo.com";

        String firstName = email.substring(0, email.indexOf("_"));

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));

        String emailSignature = email.substring(email.indexOf("@"));

        String swapEmail = lastName+"_"+firstName+emailSignature;
        System.out.println(swapEmail);

    }
}
