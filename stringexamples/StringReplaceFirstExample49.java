package in.ganesh.stringexamples;

public class StringReplaceFirstExample49 {
    public static void main(String[] args) {
        String replacedStr = "Hello123World";
        String s = replacedStr.replaceFirst("\\w", "+");
        System.out.println(s);
    }
}
