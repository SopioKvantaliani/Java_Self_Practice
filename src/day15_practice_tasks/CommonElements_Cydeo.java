package day15_practice_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements_Cydeo {
    public static void main(String[] args) {

        Set<Integer> num1 = new HashSet<>(Arrays.asList(
                10, 8, 11, 20, 5, 0
        ));

        Set<Integer> num2 = new HashSet<>(Arrays.asList(
                30, 0, 20, 40, 50, 10, 60
        ));

        Set <Integer> common = new TreeSet<>();

        for (Integer each : num1) {
            if (num2.contains(each)){
                common.add(each);
            }
        }

        System.out.println(common);


    }
}
