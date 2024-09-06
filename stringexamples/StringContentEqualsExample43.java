package in.ganesh.stringexamples;

public class StringContentEqualsExample43 {
    public static void main(String[] args) {

        String str1 = "hello world";

        StringBuilder sb = new StringBuilder("hello world");

        StringBuffer sf = new StringBuffer("hello world");

        CharSequence cs = "hello world";

        String str2 = "Hello World";

        boolean res1 = str1.contentEquals(sb);
        System.out.println("compare str1 with string builder :: "+res1);

        boolean res2 = str1.contentEquals(sf);
        System.out.println("compare str1 with string buffer :: "+res2);

        boolean res3 = str1.contentEquals(cs);
        System.out.println("compare str1 with char sequence :: "+res3);

        boolean res4 = str1.contentEquals(str2);
        System.out.println("compare str1 with str2 :: "+res4);


    }
}
