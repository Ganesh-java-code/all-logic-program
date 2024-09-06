package in.ganesh.stringexamples;

public class StringHashcodeExample44 {
    public static void main(String[] args) {


      String str1 = "hello world";
      String str2 = "Hello World";
      String str3 = "hello world";
      String str4 = "diff string";

      int str1Hashcode = str1.hashCode();
      int str2Hashcode =  str2.hashCode();
      int str3Hashcode = str3.hashCode();
      int str4Hashcode = str4.hashCode();

        System.out.println("str1 :: "+str1+"hashcode :: "+str1Hashcode);
        System.out.println("str2 :: "+str2+"hashcode :: "+str2Hashcode);
        System.out.println("str3 :: "+str3+"hashcode :: "+str3Hashcode);
        System.out.println("str4 :: "+str4+"hashcode :: "+str4Hashcode);

        System.out.println("+++++++++++++++++++");

        System.out.println(str1Hashcode==str2Hashcode);
        System.out.println(str1Hashcode==str3Hashcode);
        System.out.println(str1Hashcode==str4Hashcode);


    }
}
