package in.ganesh.stringexamples;

public class StringOffsetByCodePointExample39 {
    public static void main(String[] args) {

        String str = "abc\uD83D\uDE00def"; // The string "abc😀def", where 😀 is a supplementary character

        // Get the index offset by 4 code points from index 0
        int offsetIndex = str.offsetByCodePoints(0, 4);
        System.out.println("Offset by 4 code points from index 0: " + offsetIndex);
        System.out.println("Character at the new index: " + str.charAt(offsetIndex));

    }
}
