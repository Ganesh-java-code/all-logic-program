package in.ganesh.stringexamples;

public class StringInternExample26 {
    public static void main(String[] args) {

        String str1 = new String("ganesh patil");

        String str2 = str1.intern();

        String str3 = "ganesh patil";

        boolean b = str2 == str3;

        System.out.println(b);

    }
}
