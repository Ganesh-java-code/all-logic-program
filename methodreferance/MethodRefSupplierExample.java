package in.ganesh.methodreferance;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefSupplierExample {
    public static void main(String[] args) {

        String str = "ganesh patil";

        Supplier<String> toUpper = str :: toUpperCase;

        System.out.println(toUpper.get());

        Function<String,String> name = String::toUpperCase;

        String upperCase = name.apply("dhotri, solapur");
        System.out.println(upperCase);

        System.out.println(name.apply("maharashtra"));


    }
}
