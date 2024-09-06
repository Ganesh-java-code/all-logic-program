package in.ganesh.stringexamples;

import java.util.Locale;

public class StringFormatExample22 {
    public static void main(String[] args) {

        String name = "ganesh";
        int age = 31;
        String formatted = String.format("Name :: %s, Age :: %d", name, age);

        System.out.println(formatted);

        double pi = 3.14159265359;
        String formatted1 = String.format("Value of Pi :: %.2f", pi);
        System.out.println(formatted1);

        String name1 = "ganesh";
        int age1 = 31;
        String formatted2 = String.format("Name :: %-10s, Age :: %03d", name1, age1);
        System.out.println(formatted2);

        String fname = "Ganesh";
        String lname = "Patil";
        String formatted3 = String.format("lname: %2$s, fname: %1$s", fname, lname);
        System.out.println(formatted3);

        String productName = "Laptop";
        int quantity = 5;
        double price = 799.99;
        String formatted4 = String.format("Product Name: %s, Quantity: %d, Price: $%.2f", productName, quantity, price);
        System.out.println(formatted4);

        double number = 12345.678;
        String formattedStringUS = String.format(Locale.US, "US: %,.2f", number);
        String formattedStringGermany = String.format(Locale.GERMANY, "Germany: %,.2f", number);
        System.out.println(formattedStringUS);      // Output: US: 12,345.68
        System.out.println(formattedStringGermany); // Output: Germany: 12.345,68

    }
}
