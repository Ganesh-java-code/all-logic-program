package in.ganesh.stringexamples;

public class StringEqualExample05 {
    public static void main(String[] args) {

        String name1 = new String("ganesh patil");
        String name2 = new String("ganesh patil");

        String trimmed = name1.replaceAll("\\s+", " ").trim();
        String trimmed1 = name2.replaceAll("\\s+", " ").trim();

        boolean equals = trimmed.equals(trimmed1);

        System.out.println(equals);

    }
}
