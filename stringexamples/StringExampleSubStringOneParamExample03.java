package in.ganesh.stringexamples;

import java.util.*;
import java.util.stream.Collectors;

public class StringExampleSubStringOneParamExample03 {
    public static void main(String[] args) {

        String name = new String("ganesh patil AISH");

        List<String> stringList = Arrays.asList(name.split(" "));

       // String substring = name.substring(0, 1);

        List<String> stringList1 = stringList.stream().sorted(Comparator.comparing(name1 -> name1.substring(0).toLowerCase())).collect(Collectors.toList());

        Collections.reverse(stringList1);

        String join = String.join(" ", stringList1);

        System.out.println(join);


    }
}
