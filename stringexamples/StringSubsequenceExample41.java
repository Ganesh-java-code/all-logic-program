package in.ganesh.stringexamples;

public class StringSubsequenceExample41 {
    public static void main(String[] args) {

        String sentence = "Find the substring between two markers.";

        int i1 = sentence.indexOf("Find") + "Find".length();
        int i2 = sentence.indexOf("markers");

        if( i1!=-1 && i2!=-1 && i1<i2 ){
            CharSequence sequence = sentence.subSequence(i1, i2);
            System.out.println("subsequesnce :: "+sequence.toString().trim());
        }else {
            System.out.println("invalid indices...");
        }

        String string = "Hello";
        if( string.contains("Hell") ){
            System.out.println("substring");
        }else {
            System.out.println("not");
        }




    }
}
