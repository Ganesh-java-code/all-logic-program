package in.ganesh.stringexamples;

import java.util.Locale;

public class StringToUpperCaseMethodExample09 {
    public static void main(String[] args) {

        String name = "ganesh patil";

        String upperCase = name.toUpperCase();

        System.out.println(upperCase);

        Locale locale = new Locale("fr", "FR");

        String upperCase1 = locale.getCountry();

        System.out.println(upperCase1);


    }
}
