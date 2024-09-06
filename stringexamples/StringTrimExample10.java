package in.ganesh.stringexamples;

public class StringTrimExample10 {
    public static void main(String[] args) {

        String trim = new String("  ganesh         patil    ");
        String upperCase = trim.replaceAll("\\s+", " ").trim().toUpperCase();
        System.out.println(upperCase);

    }
}
