package day09_practice_tasks;

public class Items {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        int index = -1;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                index = i;
            }
            if (items[i].contains("iPad")){
                System.out.println(true);
            }
       }
        System.out.println(index);

        for (int i = 0; i < items.length; i++) {
            System.out.println("name: "+items[i]+" - price: "+prices[i]+" - #ID: "+itemIDs[i]);
        }

    }
}
/*

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID

 */
