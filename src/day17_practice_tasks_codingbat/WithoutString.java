package day17_practice_tasks_codingbat;

import java.util.Locale;

public class WithoutString {
    public static void main(String[] args) {

        String base = "THIS is a FISH";
        String remove = "iS";
        String result = "";
        int i = 0;
        int removeLength = remove.length();
        base = base.toLowerCase();
        remove = remove.toLowerCase();

        while (i<base.length()){
            if (i <= base.length() - removeLength && base.substring(i, i+removeLength).equals(remove)){
                i+=removeLength;
            }else {
                result +=base.charAt(i);
                i++;
            }
        }

        System.out.println(result);
    }
}
