package day16_practice_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {

        Map <Character, Integer > map1 = new HashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);

        Map <Character, Integer > map2 = new HashMap<>();
        map2.put('A', 10);
        map2.put('B', 50);
        map2.put('C', 40);

        map1.putAll(map2);

        System.out.println(map1);

        System.out.println("-----------------");

        Map <Character, Integer > map3 = new HashMap<>();
        map3.put('A', 10);
        map3.put('B', 20);

        Map <Character, Integer > map4 = new HashMap<>();
        map4.put('A', 10);
        map4.put('B', 50);
        map4.put('C', 40);

        for (Map.Entry<Character, Integer> each : map3.entrySet()) {
            map4.putIfAbsent(each.getKey(), each.getValue());
        }

        System.out.println(map4);
    }
}
