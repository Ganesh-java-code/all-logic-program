package in.ganesh.stringexamples;

import java.util.Arrays;
import java.util.List;

public class StringJoinExample19 {
    public static void main(String[] args) {

        //Joining an Array of Strings
        //  String join(CharSequence delimiter, CharSequence... elements)
        String[] word = {"Hello", "world", "from", "Java"};
        String result1 = String.join(" ", word);
        System.out.println(result1);  // Output: Hello world from Java

        //Joining a List of Strings
        //  String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
        List<String> words = Arrays.asList("Java", "is", "fun");
        String result = String.join("-", words);
        System.out.println(result);  // Output: Java-is-fun

        // Joining with No Delimiter
        String[] wrd = {"Java", "Programming", "Language"};
        String result2 = String.join("", wrd);
        System.out.println(result2);  // Output: JavaProgrammingLanguage

        //Example 4: Joining with Multiple Delimiters
        List<String> multipleDel = Arrays.asList("Java", "Python", "C++");
        String result3 = String.join(",", multipleDel);
        result3 = "[" + result3 + "]";
        System.out.println(result3);  // Output: [Java,Python,C++]



    }
}
