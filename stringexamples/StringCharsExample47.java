package in.ganesh.stringexamples;

import java.util.stream.Collectors;

public class StringCharsExample47 {
    public static void main(String[] args) {


        // 1. print each char and its unicode
        String name = "hello world";
        name.chars().forEach(ch->System.out.println((char)ch+" => "+ch));

        System.out.println("========================");

        // 2. convert all char to uppercase
        String upperCase = name.chars()
                .mapToObj(ch->Character.toUpperCase((char)ch))
                .map(String :: valueOf)
                .collect(Collectors.joining());
        System.out.println(upperCase);

        System.out.println("========================");

        // 3. filter out all non letter character
        String onlyLetters = name.chars().filter(Character :: isLetter).mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
        System.out.println(onlyLetters);

        System.out.println("========================");

        // 4. only hello will be in uppercase and world in lower case
        String upperCase1 = name.substring(0, 5).chars().mapToObj(ch -> String.valueOf((char) Character.toUpperCase(ch))).collect(Collectors.joining());
        String append = upperCase1+name.substring(5);
        System.out.println("modified :: "+append);


    }
}
