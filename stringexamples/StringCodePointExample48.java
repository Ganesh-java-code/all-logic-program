package in.ganesh.stringexamples;

public class StringCodePointExample48 {
    public static void main(String[] args) {

        String name = "Hello";
        name.codePoints().forEach(cp-> System.out.println("codepoint :: "+cp));

    }
}
