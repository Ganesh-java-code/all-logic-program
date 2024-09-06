package in.ganesh.stringexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SplitExample {
    public static void main(String[] args) {

        String name = "siddharth ganesh patil ";

        List<String> list = Arrays.asList(name.split(" "));

        List<String> list1 = list.stream().sorted(Comparator.comparing(word -> word.substring(0, 1).toLowerCase())).collect(Collectors.toList());

        Collections.reverse(list1);

        String join = String.join(" ", list1);

        System.out.println(join);

    }
}
