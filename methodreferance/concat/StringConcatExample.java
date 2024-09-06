package in.ganesh.methodreferance.concat;

import java.util.function.BiFunction;

public class StringConcatExample {

    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = String::concat;
        String s = biFunction.apply("ganesh ", "patil");
        System.out.println(s);
    }

}
