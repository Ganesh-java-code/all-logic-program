package in.ganesh.stringexamples;

import java.util.Arrays;

public class StringCodePointAtExample36 {
    public static void main(String[] args) {


       String name = "A!B";

        int codePointAt = name.codePointAt(1);
        System.out.println(codePointAt);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String upperCase = alphabet.toUpperCase();
        char[] charArray1 = upperCase.toCharArray();
        for(int i=0;i<charArray1.length;i++){
            int i1 = upperCase.codePointAt(i);
            System.out.println(charArray1[i]+" => "+i1);
        }

        System.out.println("============================================");

        String lowerCase = alphabet.toLowerCase();
        char[] charArray = lowerCase.toCharArray();
        for(int i=0;i<charArray.length;i++){
            int i1 = lowerCase.codePointAt(i);
            System.out.println(charArray[i]+" => "+i1);
        }


        System.out.println("============================================");

        String specialCharacters = "!@#$%^&*()_+[]{}|;':\",./<>?\\`~-=\\";
        char[] charArray2 = specialCharacters.toCharArray();
        Arrays.sort(charArray2);
        for(char c:charArray2){
            int i1 =(int) c;
            System.out.println(c+" => "+i1);
        }

        int i = upperCase.codePointCount(0, upperCase.length());
        System.out.println(i);

        int i1 = lowerCase.codePointCount(0, lowerCase.length());
        System.out.println(i1);

        int i2 = specialCharacters.codePointCount(0, specialCharacters.length());
        System.out.println(i2);

    }
}
