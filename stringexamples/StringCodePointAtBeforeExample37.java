package in.ganesh.stringexamples;

public class StringCodePointAtBeforeExample37 {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String upperCase = alphabet.toUpperCase();

        int i = upperCase.codePointBefore(1);
        System.out.println(i);

    }
}
