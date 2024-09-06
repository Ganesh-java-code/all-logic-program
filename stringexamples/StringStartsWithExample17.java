package in.ganesh.stringexamples;

public class StringStartsWithExample17 {
    public static void main(String[] args) {

//        String str = "Hello World";
//        boolean starts = str.startsWith("Hello"); // Output: true
//        System.out.println(starts);

        // boolean startsWith(String prefix)
        String str1 = "Hello, world!";

        System.out.println(str1.startsWith("Hello")); // Output: true
        System.out.println(str1.startsWith("world!")); // Output: false

        //boolean startsWith(String prefix, int toffset)

        String str = "JavaScript is fun!";

        System.out.println(str.startsWith("Java"));       // Output: true
        System.out.println(str.startsWith("Script", 4));  // Output: true (index 4 is where "Script" starts)
        System.out.println(str.startsWith("fun!", 14));    // Output: true



        String strCase = "OpenAI";

        System.out.println(strCase.startsWith("open")); // Output: false (case-sensitive)
        System.out.println(strCase.startsWith("Open")); // Output: true



    }
}
