package java_interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeapVsStack {

    public static void main(String[] args) {

        String name = "Sopo"; //name --> stack  //Sopo --> Heap
        int number = 5; //number --> stack //5 --> stack

        Object object = new int[5]; //object --> stack; //new int[5] --> heap

        Map<String, Object> newMap = new HashMap<>();
       // newMap.put(5, "Sopo");
        newMap.put("Sopo", 10);


    }

    public static void memory(String str){ //memory method --> stack
        List <String> newList = new ArrayList<>(); //newList --> stack; //newArrayList --> heap
        newList.add(str); //str --> stack //object --> heap
        System.out.println("newList = " + newList);
    }
}
