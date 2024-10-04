package day08_practice_tasks;

public class CodingBat_startWord {
    public static void main(String[] args) {
        System.out.println(startWord("h", "z"));
        System.out.println(7/2);

    }

    public static String startWord(String str, String word) {
        int strLength = str.length();
        int wordLength = word.length();

        if (wordLength<=1 && strLength>0){
            return str.substring(0,wordLength);
        }


        if(str.length()<2 && !(word).equals(str)){
            return "";
        }

        if (!(word.substring(1).equals(str.substring(1,wordLength)))){
            return "";
        }

        if (word.substring(1).equals(str.substring(1, wordLength))) {
            return str.substring(0, wordLength);
        } else{
            return str.substring(0,1);
        }
    }
}
