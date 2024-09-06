package in.ganesh.stringexamples;

import java.util.Scanner;

public class StringIsEmptyExample21 {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "Hello";
        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        String input = "";

        if( input.isEmpty() ){
            System.out.println("Input  string is empty :: ");
        }else {
            System.out.println("input string is :: "+input);
        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        if (userInput.isEmpty()) {
            System.out.println("You entered an empty string.");
        } else {
            System.out.println("You entered: " + userInput);
        }

        scanner.close();


        String[] strings = {"", "Java", "", "Programming"};

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) {
                System.out.println("String at index " + i + " is empty.");
            } else {
                System.out.println("String at index " + i + " is: " + strings[i]);
            }
        }


        String str = null;

        if (str == null || str.isEmpty()) {
            System.out.println("The string is either null or empty.");
        } else {
            System.out.println("The string is: " + str);
        }

    }
}
