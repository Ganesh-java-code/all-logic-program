package in.ganesh.stringexamples;

public class StringReplaceAllExample12 {
    public static void main(String[] args) {

        String  name = new String("ganesh patil");
        String replacedAll = name.replaceAll("ganesh ", "ganesh naganath ");
        System.out.println(replacedAll);

        String  ganesh = new String("Hello, world! World is big.");
        String s = ganesh.replaceAll("(?i)world", "java");
        System.out.println(s);

        String str = "The price of 123 daller is .";
        String s1 = str.replaceAll("\\d", "#");
        System.out.println(s1);


    }
}
// "\\s+" => to remove all spaces replace with single space
// "\\d" => to identify digits
// "?i(word)" => applying case insensitive
