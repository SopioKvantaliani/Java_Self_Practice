package day18_group_practice;

public class Shifting_Element_Array {
    public static void main(String[] args) {

        int [] array = new int[100];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6; //we try to assign here
        array[3] = 8;
        array[4] = 10;
        //array[5] = 10;

        int size = 5;
        int newPosition = 2;
        int newElement = 7;

        for (int i =size-1; i >=newPosition ; i--) {
            array [i+1] = array[i];
            // array [5] = 10 -> 2, 3, 6, 8, 10, 10.
            //array [4] = 8 -> 2, 3, 6, 8, 8, 10
            //array [3] = 6 -> 2, 3, 6, 6, 8, 10

        }

        array [newPosition] = newElement; //2, 3, 7, 6, 8, 10.

        for (int i = 0; i <= size; i++) {
            System.out.println(array [i]+ " ");
        }


    }
}
