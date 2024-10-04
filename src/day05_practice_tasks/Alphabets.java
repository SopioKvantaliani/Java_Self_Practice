package day05_practice_tasks;

public class Alphabets {
    public static void main(String[] args) {

        //column
        for (char i = 'A'; i <='E' ; i++) {

            //row
            for (char j = 'a'; j <='z'; j++) {
                System.out.print(i+""+j+"\t");
            }
            System.out.println();
        }
    }
}
