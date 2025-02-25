package day13_practice_tasks.phone_task;

public class PhoneClient {
    public static void main(String[] args) {

        Iphone iphone= new Iphone("Iphone", "12PRO", "Small", 1200, "Blue");
        Samsung samsung = new Samsung("Samsung", "Samsung Galaxy", "Large", 1000, "Pink");
        Nokia nokia = new Nokia("Nokia", "Nokia 10", "Small", 500, "Black");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(9082402610L);
        samsung.call(9082402620L);
        nokia.call(9082402630L);

        iphone.setBrand(null);
        System.out.println(iphone);

        iphone.call(9082402610L);
        iphone.faceTime(9082402610L);

        nokia.call(9082402610L);
        nokia.text(9082402610L);
        System.out.println(nokia.getPrice());

        samsung.developMode();
        System.out.println(samsung.getPrice());

    }
}
