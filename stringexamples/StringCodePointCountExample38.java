package in.ganesh.stringexamples;

public class StringCodePointCountExample38 {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*()_+[]{}|;':\",./<>?\\`~-=\\";

        String lowerCase = alphabet.toLowerCase();
        String upperCase = alphabet.toUpperCase();

        int i = lowerCase.codePointCount(0, lowerCase.length());
        int i1 = upperCase.codePointCount(0, upperCase.length());
        int i2 = specialCharacters.codePointCount(0, specialCharacters.length());

        System.out.println(i+" "+i1+" "+i2);


    }
}
