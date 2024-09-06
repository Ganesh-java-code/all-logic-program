package in.ganesh.stringexamples;

import java.util.List;
import java.util.stream.Collectors;

public class StringLinesExammple46 {
    public static void main(String[] args) {

        String multiLineStr = "Hello\n\nThis is a sample text\n\nwith multiple lines\nand some empty lines.\n";

        List<String> stringList = multiLineStr.lines()
                .filter(blank -> ! blank.isEmpty())
                .map(String :: toUpperCase)
                .toList();

        stringList.forEach(System.out::println);


    }
}
