package in.ganesh.stringexamples;

public class StringEndsWithExample18 {
    public static void main(String[] args) {

        String str = "Hello, world!";

        System.out.println(str.endsWith("world!")); // Output: true
        System.out.println(str.endsWith("Hello"));  // Output: false

        String str1= "OpenAI";

        System.out.println(str1.endsWith("AI"));  // Output: true
        System.out.println(str1.endsWith("ai"));  // Output: false (case-sensitive)


        String filename = "document.pdf";

        if (filename.endsWith(".pdf")) {
            System.out.println("This is a PDF file.");
        } else {
            System.out.println("This is not a PDF file.");
        }

        String str2 = "Hello, world!";

        System.out.println(str2.endsWith(""));  // Output: true

    }
}
