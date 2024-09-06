package in.ganesh.stringexamples;

public class StringGetCharsExample40 {
    public static void main(String[] args) {

        String name = "Hello World!";
        char[] c = new char[12]; // Create a destination array with sufficient length

        // Copy "World" from name into c starting at index 5
        name.getChars(6, 12, c, 5);

        // Convert the character array to a string and print it
        System.out.println("Destination array content: '" + new String(c) + "'");

    }
}
