package day10_practice_tasks.CodingBat;

public class CloseFar {
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;

        boolean isCloseB = Math.abs(a-b) <=1;
        boolean isCloseC = Math.abs (a-c)<=1;

        boolean isBFarFromBoth = Math.abs (a-b)>=2 && Math.abs (b-c)>=2;
        boolean isCFarFromBoth = Math.abs (b-c)>=2 && Math.abs (c-a)>=2;

        System.out.println(isCloseB && isCFarFromBoth || isCloseC && isBFarFromBoth);



    }
}
