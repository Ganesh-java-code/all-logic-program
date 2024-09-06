package in.ganesh.stringexamples;

public class StringMatchExample23 {
    public static void main(String[] args) {


        String name = "Hello world";

        boolean matches = name.matches(".*world*.");
        System.out.println(matches);

    }
}
