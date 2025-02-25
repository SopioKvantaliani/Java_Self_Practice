package day16_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {

        Map <Integer, String > map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        System.out.println(map);
        Map<String, Integer> reverted = new HashMap<>();


        for (Map.Entry<Integer, String> eachKey : map.entrySet()) {
            reverted.put(eachKey.getValue(), eachKey.getKey());
        }

        System.out.println(reverted);
    }
}
