package in.ganesh.stringexamples;

public class StringValeOfExample20 {
    public static void main(String[] args) {

        //static String valueOf(boolean b)
        //static String valueOf(char c)
        //static String valueOf(char[] data)
        //static String valueOf(char[] data, int offset, int count)
        //static String valueOf(double d)
        //static String valueOf(float f)
        //static String valueOf(int i)
        //static String valueOf(long l)
        //static String valueOf(Object obj)


        // Example 1: Converting Primitive Types to String
        int number = 100;
        double decimal = 10.5;
        boolean flag = false;

        String numberString = String.valueOf(number);
        String StringDecimal = String.valueOf(decimal);
        String StringBoolean = String.valueOf(flag);

        System.out.println("Integer as String :: "+numberString);
        System.out.println("Decimal as String :: "+StringDecimal);
        System.out.println("Boolean as String :: "+StringBoolean);

        // Example 2: Converting a Character Array to String
        char[] charArray = {'j','a','v','a'};

        String valueOfCharArray = String.valueOf(charArray);
        System.out.println(valueOfCharArray);

        //Example 3: Converting an Object to String
        Object obj = 42;
        String valueOfObject = String.valueOf(obj);
        System.out.println(valueOfObject);

        //Example 4: Handling Null Objects
        Object objNull = null;
        String valueOfObjectNull= String.valueOf(objNull);
        System.out.println(valueOfObjectNull);

        // Example 5: Partial Conversion of a Character Array
        char[] charArr = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a'};
        String valueOfPartialConversion = String.valueOf(charArr, 6, 4);
        System.out.println(valueOfPartialConversion);

    }
}
