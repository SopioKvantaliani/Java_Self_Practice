package day14_practice_tasks.loop_ppt;

public class GuessResults {
    public static void main(String[] args) {


        System.out.println("------------- 1. ------------------");
        boolean flag = true;
        for (int i = 0; i <= 5; i++) {
            if (flag) {
                System.out.println(i + " ");
            }
            flag = !flag;
        }

        System.out.println("------------- 2. ------------------");

        String str = "Java"; //String pool
        str = "Mustafa";
        String str2 = new String(str);
        int count = 10;

        do {
            count += 2;
        } while (str == str2);

        System.out.println(count);

        System.out.println("------------- 3. ------------------");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(" " + i);
        }
        System.out.println("------------- 4. ------------------");

        int time = 50;
        do {
            System.out.println(time + ", ");
            time++;
        } while (time < 53);

        System.out.println("------------- 5. ------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 3; j >= 1; j--) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }

        System.out.println("------------- 6. ------------------");
        int x = 0;
        while (x < 4) {
            x = x + 1;
        }
        System.out.println(x);

        System.out.println("------------- 7. ------------------");


        //infinite loop
//        int age = 50;
//        do {
//            System.out.println(age + " ");
//        } while (age < 53);


    }
}
