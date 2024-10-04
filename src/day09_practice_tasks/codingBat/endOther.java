package day09_practice_tasks.codingBat;

import java.util.Locale;

public class endOther {
    public static void main(String[] args) {
        String a = "Hiabc";
        String b = "abc";

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length()>b.length() || a.length()==b.length()){
            if (a.substring(a.length()-b.length()).equals(b)){
                System.out.println(true);
            }
        }

        if (b.length()>a.length()){
            if (b.substring(b.length()-a.length()).equals(a)){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
