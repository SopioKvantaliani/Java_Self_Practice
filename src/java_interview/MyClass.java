package java_interview;


//show order of execution

public class MyClass {
    //instance variable
    private int x;


    //static variable
    static int y;

    static {
        y = 20;
        System.out.println("Static block executed");
    }

    //instance block
    {
        x = 10; //Initialize x in the instance block
        System.out.println("Instance Block Executed. ");
    }

    //Constructor
    public MyClass(){

        System.out.println("Constructor Executed.");
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

    }

}
