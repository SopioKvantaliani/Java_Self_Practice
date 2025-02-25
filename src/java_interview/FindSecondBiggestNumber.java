package java_interview;

public class FindSecondBiggestNumber {

    public static void main(String[] args) {
        
        int [] number = {5, 2, 3, 4, 10, 3, 15};
        int biggestNumber = 0; 
        int secondBiggestNumber = 0;

        for (int i = 0; i < number.length; i++) {
            
            if (number[i]>biggestNumber){
                secondBiggestNumber = biggestNumber;
                biggestNumber = number[i];
            }
            
        }
        System.out.println(biggestNumber);
        System.out.println("secondBiggestNumber = " + secondBiggestNumber);
    }
}
