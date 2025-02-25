package day16_practice_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeef";
        Map<Character, Integer> map = new LinkedHashMap<>();
        String checked = "";

        /*
        a = 1;

         */
        for (int i = 0; i<str.length(); i++){
            char key = str.charAt(i);
            if (!checked.contains(""+key) &&  !map.containsKey(key)){
                map.put(key, 1);
                checked +=key;
            }else {
                map.remove(key);
            }
        }

        System.out.println(map);

    }
}
