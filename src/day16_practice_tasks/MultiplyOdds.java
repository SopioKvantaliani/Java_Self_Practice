package day16_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class MultiplyOdds {
    public static void main(String[] args) {

        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('a', 1);
        map1.put('b', 2);
        map1.put('c', 3);
        map1.put('d', 4);
        map1.put('e', 5);

        for (Map.Entry<Character, Integer> eachKey : map1.entrySet()) {
            int values = eachKey.getValue();
            if (values%2!=0 ){
                values *=2;
                eachKey.setValue(values);
            }
        }
        System.out.println(map1);
    }
}
