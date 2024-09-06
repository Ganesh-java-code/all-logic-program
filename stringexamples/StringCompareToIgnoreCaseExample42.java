package in.ganesh.stringexamples;

public class StringCompareToIgnoreCaseExample42 {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "HELLO";
        String str3 = "world";
        String str4 = "Hello";
        String str5 = "apple";

       int res0 = str1.compareToIgnoreCase(str2);
       int res1 = str1.compareToIgnoreCase(str4);
       int res2 =  str1.compareToIgnoreCase(str3);
       int res3 = str1.compareToIgnoreCase(str5);

        System.out.println(res0);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}
